package com.test.web.mapper;
import java.util.List;
import com.test.web.domain.ProductDTO;
import org.springframework.stereotype.Repository;

/**
 * ProductMapper
 */
@Repository
public interface ProductMapper {
    public void insertProduct(ProductDTO product);
    public List<ProductDTO> selectProducts();
    public List<ProductDTO> selectProductsByOption(ProductDTO product);
    public ProductDTO selectProductByproductId(String product);
    public void updateProduct(ProductDTO product);
    public void deleteProduct(ProductDTO product);   
}