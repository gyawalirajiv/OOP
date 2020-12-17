package com.rajiv.callCenter;

public class Manager extends Receiver {
    public Manager(String name, CallManager callManager) {
        super(name, Role.MANAGER, callManager);
    }
}
