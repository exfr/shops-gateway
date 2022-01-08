package com.practice.security.controller;

import com.practice.security.client.PurchaseClient;
import com.practice.security.model.Purchase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MainController {

    private PurchaseClient purchaseClient;

    @GetMapping("/purchase/any")
    ResponseEntity<Purchase> seeAnyAnimal(){
        return purchaseClient.random();
    }
}
