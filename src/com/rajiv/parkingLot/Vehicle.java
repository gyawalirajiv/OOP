package com.rajiv.parkingLot;

public abstract class Vehicle {

    private Size size;
    private String numberPlate;
    private ParkingSpace parkingSpace;

    public Vehicle(Size size, String numberPlate) {
        this.size = size;
        this.numberPlate = numberPlate;
    }

    public Size getSize() {
        return size;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }
}
