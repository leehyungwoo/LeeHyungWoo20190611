package com.test.web.domain;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;
import lombok.Data;

/**
 * ProductDTO
 */
@Data @Component @Lazy
public class ProductDTO {
    private String productId,
                   productName,
                   supplierId,
                   categoryId,
                   unit,
                   price,
                   photo;
}