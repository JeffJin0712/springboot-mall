package com.jeffjin.springbootmall.dto;

import com.jeffjin.springbootmall.constant.ProductCategory;
import lombok.*;

@Data
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
//@RequiredArgsConstructor
public class ProductRequestLombok {

    private String productName;
    private ProductCategory category;
    private String imageUrl;
    private Integer price;
    private Integer stock;
    private String description;

    public ProductRequestLombok(@NonNull String productName,
                                @NonNull ProductCategory category,
                                @NonNull String imageUrl,
                                @NonNull Integer price,
                                @NonNull Integer stock,
                                String description) {
        this.productName = productName;
        this.category = category;
        this.imageUrl = imageUrl;
        this.price = price;
        this.stock = stock;
        this.description = description;
    }
}
