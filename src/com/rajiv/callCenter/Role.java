package com.rajiv.callCenter;

public enum Role {
    RESPONDENT (0),
    MANAGER (1),
    DIRECTOR (2);

    private int value;

    Role(int v){
        this.value = v;
    }

    public int getOrdinal(){
        return this.value;
    }

    public static Role getEnumerated(int v){
        return Role.values()[v];
    }
}
