package com.test.web.serviceImpl;
import java.util.List;
import com.test.web.domain.ProductDTO;
import com.test.web.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * ProductServiceImpl
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public void addProduct(ProductDTO product) {

    }

    @Override
    public List<ProductDTO> findProducts() {
        return null;
    }

    @Override
    public List<ProductDTO> findProductsByOption(ProductDTO product) {
        return null;
    }

    @Override
    public ProductDTO findProductByproductId(String product) {
        return null;
    }

    @Override
    public void updateProduct(ProductDTO product) {

    }

    @Override
    public void deleteProduct(ProductDTO product) {

    }


}
 