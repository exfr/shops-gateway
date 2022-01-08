package com.practice.security.client;

import com.practice.security.model.Purchase;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class PurchaseClient {

    private final RestTemplate restTemplate;

    public ResponseEntity<Purchase> random() {
        return restTemplate.getForEntity("http://purchase-service/random",
                Purchase.class);
    }
}