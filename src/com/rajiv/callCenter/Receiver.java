package com.rajiv.callCenter;

public abstract class Receiver {

    private String name;
    private Boolean available = true;
    protected Role role;
    CallManager callManager;

    public Receiver(String name, Role role, CallManager callManager) {
        this.name = name;
        this.role = role;
        this.callManager = callManager;
    }

    public void receiveCall(Call call){
        System.out.println(this.name + ": Received call from: " + call.getFrom());
        available = false;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        available = true;
        System.out.println(this.name + ": Call Ended: " + call.getFrom());
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
