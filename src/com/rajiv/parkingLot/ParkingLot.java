package com.rajiv.parkingLot;

import java.util.List;

public class ParkingLot {

    private List<Floor> floors;

    public ParkingSpace parkVehicle(Vehicle vehicle){
        for (Floor floor:floors) {
            if(floor.getNumberOfSpacesAvailable() == 0) continue;

            ParkingSpace parkingSpace = floor.parkVehicle(vehicle);
            if(parkingSpace != null) {
                System.out.println("Parking Space allocated.");
                return parkingSpace;
            }
        }
        System.out.println("No parking Space Available");
        return null;
    }

    public Vehicle removeVehicle(int floorId, int parkingSpaceId){
        for (Floor floor: floors) {
            if(floor.getId() == floorId) return floor.removeVehicle(parkingSpaceId);
        }
        System.out.println("Parking Space was not found!");
        return null;
    }
}
