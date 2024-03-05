package com.example.moneytransfer.repositories;

import com.example.moneytransfer.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {
    public UserModel getUserByDocument(String document);
}
