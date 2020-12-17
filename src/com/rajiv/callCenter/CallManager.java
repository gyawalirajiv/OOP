package com.rajiv.callCenter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CallManager {

    List<Respondent> respondents = new ArrayList<>();
    List<Manager> managers = new ArrayList<>();
    List<Director> directors = new ArrayList<>();
    CallQueue callsQueue = new CallQueue();

    public void startPopulatingTheRespondents(String[] args) {
        for (int i = 0; i < 7; i++) {
            respondents.add(new Respondent("Respondent " + i, this));
        }
        for (int i = 0; i < 5; i++) {
            managers.add(new Manager("Manager " + i, this));
        }
        for (int i = 0; i < 2; i++) {
            directors.add(new Director("Director " + i, this));
        }
    }

    public void handleIncomingCall(Call call){
        if(call.minRoleRequired == Role.RESPONDENT) assignCallToRespondent(call, Role.RESPONDENT);
        else if(call.minRoleRequired == Role.RESPONDENT) assignCallToRespondent(call, Role.MANAGER);
        else assignCallToRespondent(call, Role.DIRECTOR);
    }

    public void assignCallToRespondent(Call call, Role role){
        if(role == Role.RESPONDENT){
            for (Respondent respondent :respondents) {
                if(respondent.getAvailable()){
                    respondent.receiveCall(call);
                    return;
                }
            }
        }

        if(role == Role.MANAGER){
            for (Manager manager :managers) {
                if(manager.getAvailable()){
                    manager.receiveCall(call);
                    return;
                }
            }
        }

        for (Director director :directors) {
            if(director.getAvailable()){
                director.receiveCall(call);
                return;
            }
        }
        if(call.minRoleRequired == Role.RESPONDENT) callsQueue.callsForRespondents.add(call);
        else if(call.minRoleRequired == Role.MANAGER) callsQueue.callsForManagers.add(call);
        else callsQueue.callsForDirectors.add(call);
    }
}
