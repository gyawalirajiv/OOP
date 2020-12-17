package com.rajiv.callCenter;

public class Call {
    Long id;
    String from;
    Role minRoleRequired = Role.RESPONDENT;

    public Call(Long id, String from) {
        this.id = id;
        this.from = from;
    }

    public Call(Long id, String from, Role minRoleRequired) {
        this.id = id;
        this.from = from;
        this.minRoleRequired = minRoleRequired;
    }

    public String getFrom() {
        return from;
    }
}
