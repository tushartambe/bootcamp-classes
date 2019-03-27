package com.bootcamp.carparking;

import java.util.ArrayList;
import java.util.List;

public class Attendant {
private List<ParkingLot> parkingLots;

    public Attendant() {
        this.parkingLots = new ArrayList<>();
    }

    void addParkingLot(ParkingLot parkingLot){
        this.parkingLots.add(parkingLot);
    }
    void notification(String message){
        System.out.println(message);
    }
}
