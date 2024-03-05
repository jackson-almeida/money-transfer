package com.example.moneytransfer.enums;

public enum UserTypeEnum {
    CLIENT("CLIENT"),
    SELLER("SELLER");

    private final String value;

    UserTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
