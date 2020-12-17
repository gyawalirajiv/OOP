package com.rajiv.callCenter;

public class Director extends Receiver {
    public Director(String name, CallManager callManager) {
        super(name, Role.DIRECTOR, callManager);
    }
}
