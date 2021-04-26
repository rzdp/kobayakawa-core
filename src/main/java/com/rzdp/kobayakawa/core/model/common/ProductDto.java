package com.rzdp.kobayakawa.core.model.common;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDto extends BaseDto{

    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

}
