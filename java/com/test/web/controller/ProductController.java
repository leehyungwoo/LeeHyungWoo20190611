package com.test.web.controller;

import com.test.web.domain.ProductDTO;
import com.test.web.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * ProductController
 */
@RestController
public class ProductController {
    
    @Autowired ProductService productService;
    @Autowired ProductDTO product;
    


}