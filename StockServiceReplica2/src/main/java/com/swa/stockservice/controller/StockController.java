package com.swa.stockservice.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * @PROJECT IntelliJ IDEA
 * @AUTHOR Bikash Mainali
 * @DATE 8/6/22
 */

@RestController
public class StockController {

    @GetMapping("stock/{productNo}")
    private ResponseEntity<Integer> getQuantityInStock(@PathVariable String productNo){
        Map<String, Integer> stockMap = new HashMap<>();
        System.out.println("Stock Service Replica 2");
        stockMap.put("1", 5);
        stockMap.put("2", 15);
        int result = stockMap.get(productNo);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
