package com.example.moneytransfer.utils;

import com.example.moneytransfer.enums.UserTypeEnum;

public class ValidateDocument {

    public static boolean documentIsValid(String document, Enum<UserTypeEnum> type) {
        boolean containsOnlyDigits = document.matches("[0-9]+");

        // TODO: Tratar com excessão ou retornar um bool?
        if (((type.equals(UserTypeEnum.CLIENT) && document.length() == 11)
                || (type.equals(UserTypeEnum.SELLER) && document.length() == 14)) && containsOnlyDigits) {
            return true;
        }

        return false;
    }
}
