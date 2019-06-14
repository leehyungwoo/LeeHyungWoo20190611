package com.test.web.service;
import java.util.List;
import com.test.web.domain.ProductDTO;
import org.springframework.stereotype.Component;


/**
 * ProductService
 */
@Component
 public interface ProductService {
    public void addProduct(ProductDTO product);
    public List<ProductDTO> findProducts();
    public List<ProductDTO> findProductsByOption(ProductDTO product);
    public ProductDTO findProductByproductId(String product);
    public void updateProduct(ProductDTO product);
    public void deleteProduct(ProductDTO product);
}

 