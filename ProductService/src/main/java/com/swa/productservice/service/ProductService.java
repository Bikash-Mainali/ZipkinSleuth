package com.swa.productservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @PROJECT IntelliJ IDEA
 * @AUTHOR Bikash Mainali
 * @DATE 8/6/22
 */
@FeignClient(name = "StockService")
public interface ProductService {

    @GetMapping("/stock/{productNo}")
    ResponseEntity<Integer> getQuantityInStock(@PathVariable  String productNo);
}
