package com.bootcamp.carparking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {

    @Test
    void shouldParkACarInParkingLot() {
        ParkingLot parkingLot = new ParkingLot(2);
        Attendant attendant = new Attendant();
        parkingLot.addAttendent(attendant);
        attendant.addParkingLot(parkingLot);

        Car swift = new Car("Swift");

        parkingLot.park(swift);
        assertEquals(1, parkingLot.getTotalCars());
    }


    @Test
    void shouldUnParkCarInParkingLot() {
        ParkingLot parkingLot = new ParkingLot(4);
        Attendant attendant = new Attendant();
        parkingLot.addAttendent(attendant);
        attendant.addParkingLot(parkingLot);

        Car swift = new Car("Swift");
        Car honda_city = new Car("Honda City");
        Car bollero = new Car("Bollero");
        parkingLot.park(swift);
        parkingLot.park(honda_city);
        parkingLot.park(bollero);
        assertEquals(3, parkingLot.getTotalCars());

        parkingLot.unPark(swift);
        parkingLot.unPark(bollero);
        assertEquals(1, parkingLot.getTotalCars());
    }


    @Test
    void shouldParkAndUnparkCarsFromParkingLotAndNotifyAttendantWhenLotsBecomesFullAndAvailable() {
        ParkingLot parkingLot = new ParkingLot(3);
        TestAttendant attendant = new TestAttendant();
        parkingLot.addAttendent(attendant);
        attendant.addParkingLot(parkingLot);
        Car honda_city = new Car("Honda City");
        Car bollero = new Car("Bollero");
        Car swift = new Car("Swift");

        parkingLot.park(honda_city);
        parkingLot.park(bollero);
        parkingLot.park(swift);
        assertTrue(attendant.isCalled);

        parkingLot.unPark(honda_city);
        assertTrue(attendant.isCalled);
    }
}


class TestAttendant extends Attendant {
    boolean isCalled;

    @Override
    void notification(String message) {
        super.notification(message);
        this.isCalled = true;
    }
}
