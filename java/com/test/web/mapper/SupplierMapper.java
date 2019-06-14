package com.test.web.mapper;
import java.util.List;
import com.test.web.domain.SupplierDTO;
import org.springframework.stereotype.Repository;

/**
 * SupplierMapper
 */
@Repository
public interface SupplierMapper {
    public void insertSupplier(SupplierDTO supplier);
    public List<SupplierDTO> selectSuppliers();
    public List<SupplierDTO> selectSuppliersByOption(SupplierDTO supplier);
    public SupplierDTO selectSupplierBysupplierId(String supplier);
    public void updateSupplier(SupplierDTO supplier);
    public void deleteSupplier(SupplierDTO supplier);   
}