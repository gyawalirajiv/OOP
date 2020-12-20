package com.rajiv.parkingLot;

import java.text.SimpleDateFormat;
import java.time.Instant;

public class SpaceAllocator {

    private Vehicle vehicle;
    private Instant startTime;

    public SpaceAllocator() {}

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }
}