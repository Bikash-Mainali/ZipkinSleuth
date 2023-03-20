package com.swa.productservice.controller;

import com.swa.productservice.domain.Product;
import com.swa.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @PROJECT IntelliJ IDEA
 * @AUTHOR Bikash Mainali
 * @DATE 8/6/22
 */

@RestController
public class ProductController {


    @Autowired
    private ProductService productService;

    @GetMapping("/product/{productNo}")
    public ResponseEntity<List<Product>> getAllProducts(@PathVariable String productNo) throws InterruptedException {
        List<Product> productList = Arrays.asList(new Product("1", "Dell", 5),
                new Product("2", "HP", 6));
        System.out.println("Product controller");
        List<Product> result = productList.stream().filter(x -> x.getProductNo().equalsIgnoreCase(productNo)).collect(Collectors.toList());
        ResponseEntity<Integer> responseEntity = productService.getQuantityInStock(productNo);
        result.get(0).setQuantityOnStock(responseEntity.getBody());
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
