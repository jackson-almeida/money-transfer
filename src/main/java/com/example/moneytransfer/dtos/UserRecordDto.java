package com.example.moneytransfer.dtos;

import com.example.moneytransfer.enums.UserTypeEnum;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record UserRecordDto(
        @NotBlank String completeName,
        @Id String document,
        @NotNull String email,
        @NotNull String password,
        @NotNull BigDecimal amount,
        @NotNull UserTypeEnum userType
) {}
