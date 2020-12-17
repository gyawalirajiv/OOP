package com.rajiv.callCenter;

public class Respondent extends Receiver{

    public Respondent(String name, CallManager callManager) {
        super(name, Role.RESPONDENT, callManager);
    }
}
