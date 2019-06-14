package com.test.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
/**
 * CategoryvDTO
 */

 
@Data @Component @Lazy
public class CategoryDTO {
    private String categoryId,
                    categoryName,
                    description;            
}

