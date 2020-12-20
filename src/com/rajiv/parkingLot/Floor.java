package com.rajiv.parkingLot;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;

public class Floor {

    private int id;
    private List<ParkingSpace> parkingSpaces;
    private int numberOfSpacesAvailable;

    public Floor(int id, List<ParkingSpace> parkingSpaces, int numberOfSpacesAvailable) {
        this.id = id;
        this.parkingSpaces = parkingSpaces;
        this.numberOfSpacesAvailable = numberOfSpacesAvailable;
    }

    public ParkingSpace parkVehicle(Vehicle vehicle) {
        for(ParkingSpace parkingSpace : parkingSpaces){
            if(parkingSpace.getSpaceAllocator().getVehicle() == null && vehicle.getSize() == parkingSpace.getSize()){
                parkingSpace.getSpaceAllocator().setVehicle(vehicle);
                parkingSpace.getSpaceAllocator().setStartTime(Instant.now());
                vehicle.setParkingSpace(parkingSpace);
                numberOfSpacesAvailable--;
                return parkingSpace;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public int getNumberOfSpacesAvailable() {
        return numberOfSpacesAvailable;
    }

    public Vehicle removeVehicle(int parkingSpaceId) {
        for(ParkingSpace parkingSpace :parkingSpaces){
            if(parkingSpace.getId() == parkingSpaceId){
                System.out.println("Parking Starting Time was : " +
                        parkingSpace.getSpaceAllocator().getStartTime());
                Vehicle vehicle = parkingSpace.getSpaceAllocator().getVehicle();
                vehicle.setParkingSpace(null);
                parkingSpace.getSpaceAllocator().setVehicle(null);
                numberOfSpacesAvailable++;
                return vehicle;
            }
        }
        return null;
    }
}
