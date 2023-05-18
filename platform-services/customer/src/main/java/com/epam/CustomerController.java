package com.epam;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")

public class CustomerController {

    @GetMapping("/info")
    public ResponseEntity<String> getCustomerInfo() {
        return ResponseEntity.ok("Customer info");
    }

    @GetMapping("/data")
    public ResponseEntity<String> getCustomerData() {
        return ResponseEntity.ok("Customer info");
    }

}
