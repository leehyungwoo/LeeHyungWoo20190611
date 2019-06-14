package com.test.web.service;
import java.util.List;
import com.test.web.domain.SupplierDTO;
import org.springframework.stereotype.Component;


/**
 * SupplierService
 */
@Component
 public interface SupplierService {
    public void addSupplier(SupplierDTO supplier);
    public List<SupplierDTO> findSuppliers();
    public List<SupplierDTO> findSuppliersByOption(SupplierDTO supplier);
    public SupplierDTO findSupplierBysupplierId(String supplier);
    public void updateSupplier(SupplierDTO supplier);
    public void deleteSupplier(SupplierDTO supplier);
}

 