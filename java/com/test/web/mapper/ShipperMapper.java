package com.test.web.mapper;
import java.util.List;
import com.test.web.domain.ShipperDTO;
import org.springframework.stereotype.Repository;


/**
 * ShipperMapper
 */
@Repository
public interface ShipperMapper {
    public void insertShipper(ShipperDTO shipper);
    public List<ShipperDTO> selectShippers();
    public List<ShipperDTO> selectShippersByOption(ShipperDTO shipper);
    public ShipperDTO selectShipperByshipperId(String shipper);
    public void updateShipper(ShipperDTO shipper);
    public void deleteShipper(ShipperDTO shipper); 
}