package com.lalith.user.domain;

public enum AddressType
{

    PERMANENT("Permanent"),
    PRESENT("Present"),
    OFFICE("Office");

    private final String addressType;

    AddressType(String addressType){
        this.addressType = addressType;
    }
}
