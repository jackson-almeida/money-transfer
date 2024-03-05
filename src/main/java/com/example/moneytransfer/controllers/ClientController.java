package com.example.moneytransfer.controllers;

import com.example.moneytransfer.Models.UserModel;
import com.example.moneytransfer.dtos.UserRecordDto;
import com.example.moneytransfer.services.ClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/client")
    public ResponseEntity<String> getReceiver() {
        return ResponseEntity.status(HttpStatus.OK).body("Teste");
    }

    @PostMapping("/client")
    public ResponseEntity<UserModel> postClient(@RequestBody UserRecordDto userRecordDto) {
        UserModel user = new UserModel();
        BeanUtils.copyProperties(userRecordDto, user);

        String test = "Teste";

//        int testt = test::length;

//        UserModel response = clientService.save(user);
//        if (response == null) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("");
//        }

        //return ResponseEntity.status(HttpStatus.CREATED).body(clientService.save(user));
        return new ResponseEntity<UserModel>(clientService.save(user), HttpStatus.CREATED);
    }
}
