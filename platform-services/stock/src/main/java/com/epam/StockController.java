package com.epam;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")

public class StockController {

    @GetMapping("/info")
    public ResponseEntity<String> getStockInfo() {
        return ResponseEntity.ok("Stock info");
    }

}
