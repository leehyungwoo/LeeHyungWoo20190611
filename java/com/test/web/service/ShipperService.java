package com.test.web.service;
import java.util.List;
import com.test.web.domain.ShipperDTO;
import org.springframework.stereotype.Component;


/**
 * ShipperService
 */
@Component
 public interface ShipperService {
    public void addShipper(ShipperDTO shipper);
    public List<ShipperDTO> findShippers();
    public List<ShipperDTO> findShippersByOption(ShipperDTO shipper);
    public ShipperDTO findShipperByshipperId(String shipper);
    public void updateShipper(ShipperDTO shipper);
    public void deleteShipper(ShipperDTO shipper);
}

 