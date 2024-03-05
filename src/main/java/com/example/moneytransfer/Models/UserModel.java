package com.example.moneytransfer.Models;

import com.example.moneytransfer.enums.UserTypeEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "USERS")
public class UserModel {
    private String completeName;
    @Id
    private String document;
    private String email;
    private String password;
    private BigDecimal amount;
    private Enum<UserTypeEnum> userType;

    public UserModel() {}

    public UserModel(String completeName, String document, String email, String password, BigDecimal amount, Enum<UserTypeEnum> userType) {
        this.completeName = completeName;
        this.document = document;
        this.email = email;
        this.password = password;
        this.amount = amount;
        this.userType = userType;
    }

    public UserModel(String completeName, String document, String email, String password, Enum<UserTypeEnum> userType) {
        this.completeName = completeName;
        this.document = document;
        this.email = email;
        this.password = password;
        this.userType = userType;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Enum<UserTypeEnum> getUserType() {
        return userType;
    }

    public void setUserType(Enum<UserTypeEnum> userType) {
        this.userType = userType;
    }
}
