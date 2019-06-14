package com.test.web.serviceImpl;
import java.util.List;
import com.test.web.domain.SupplierDTO;
import com.test.web.service.SupplierService;
import org.springframework.stereotype.Service;

/**
 * SupplierServiceImpl
 */
@Service
public class SupplierServiceImpl implements SupplierService {

    @Override
    public void addSupplier(SupplierDTO supplier) {

    }

    @Override
    public List<SupplierDTO> findSuppliers() {
        return null;
    }

    @Override
    public List<SupplierDTO> findSuppliersByOption(SupplierDTO supplier) {
        return null;
    }

    @Override
    public SupplierDTO findSupplierBysupplierId(String supplier) {
        return null;
    }

    @Override
    public void updateSupplier(SupplierDTO supplier) {

    }

    @Override
    public void deleteSupplier(SupplierDTO supplier) {

    }

    
}

