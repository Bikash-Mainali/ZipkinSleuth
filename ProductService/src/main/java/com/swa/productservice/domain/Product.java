package com.swa.productservice.domain;

import lombok.*;

/**
 * @PROJECT IntelliJ IDEA
 * @AUTHOR Bikash Mainali
 * @DATE 8/6/22
 */

@AllArgsConstructor
@Getter
@Setter
public class Product {
    
    private String productNo;
    private String name;
    private Integer quantityOnStock;
}
