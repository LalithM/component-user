package com.lalith.user.model;

public enum AddressType
{

    PERMANENT("Permenant"),
    PRESENT("Present"),
    OFFICE("Office");

    private final String addressType;

    AddressType(String addressType){
        this.addressType = addressType;
    }
}
