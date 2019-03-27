package com.bootcamp.carparking;

import java.util.HashSet;
import java.util.Set;

class ParkingLot {
    private Set<Car> parkedCars;
    private Integer capacity;
    private Attendant attendant;

    ParkingLot(Integer capacity) {
        this.parkedCars = new HashSet<>(capacity);
        this.capacity = capacity;
    }

    void park(Car car) {
        this.parkedCars.add(car);
        if (this.parkedCars.size() == this.capacity) {
            attendant.notification(this.toString()+" is full" );
        }
    }

    void addAttendent(Attendant attendant){
        this.attendant = attendant;
    }

    Integer getTotalCars() {
        return this.parkedCars.size();
    }

    void unPark(Car car) {
        if(this.parkedCars.size() == this.capacity){
            this.attendant.notification(this.toString() +" is avaible now to park car");
        }
        this.parkedCars.remove(car);
    }
}