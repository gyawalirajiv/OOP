package com.rajiv.parkingLot;

public class ParkingSpace {

    int id;
    private SpaceAllocator spaceAllocator;
    private Size size;

    public ParkingSpace(int id) {this.id = id;}

    public SpaceAllocator getSpaceAllocator() {
        return spaceAllocator;
    }

    public void setSpaceAllocator(SpaceAllocator spaceAllocator) {
        this.spaceAllocator = spaceAllocator;
    }

    public int getId() {
        return id;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
