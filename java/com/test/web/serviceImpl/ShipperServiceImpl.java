package com.test.web.serviceImpl;
import java.util.List;
import com.test.web.domain.ShipperDTO;
import com.test.web.service.ShipperService;
import org.springframework.stereotype.Service;

/**
 * ShipperServiceImpl
 */
@Service
public class ShipperServiceImpl implements ShipperService {

    @Override
    public void addShipper(ShipperDTO shipper) {

    }

    @Override
    public List<ShipperDTO> findShippers() {
        return null;
    }

    @Override
    public List<ShipperDTO> findShippersByOption(ShipperDTO shipper) {
        return null;
    }

    @Override
    public ShipperDTO findShipperByshipperId(String shipper) {
        return null;
    }

    @Override
    public void updateShipper(ShipperDTO shipper) {

    }

    @Override
    public void deleteShipper(ShipperDTO shipper) {

    }

    
}

 