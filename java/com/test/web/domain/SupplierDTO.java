package com.test.web.domain;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;
import lombok.Data;

/**
 * SupplierDTO
 */

@Data @Component @Lazy
public class SupplierDTO {
    private String  supplierId,
                    supplierName,
                    contactName,
                    address,
                    city,
                    postalCode,
                    country,
                    phone;
    /* 
        public void setCity(String city){
            this.city = city;
        }
        public String getCity(){
            return this.city;
        }
    */
}
