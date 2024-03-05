package com.example.moneytransfer.services;

import com.example.moneytransfer.Exceptions.BadRequestException;
import com.example.moneytransfer.Models.UserModel;
import com.example.moneytransfer.repositories.UserRepository;
import com.example.moneytransfer.utils.ValidateDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    UserRepository userRepository;

    ValidateDocument validateDocument;

    public void getClient() {

    }

    public UserModel save(UserModel user) {
        UserModel response = null;

        try {
            boolean isValid = validateDocument.documentIsValid(user.getDocument(), user.getUserType());
            if (!isValid) throw new BadRequestException("Invalid document!");

            UserModel alreadyExist = userRepository.getUserByDocument(user.getDocument());
            if (alreadyExist != null) throw new BadRequestException("Document already exist!");

            response = userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }
}
