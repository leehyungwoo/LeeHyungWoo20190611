package com.test.web.domain;

import lombok.Data;

/**
 * CustomerDTO
 */
@Data
public class CustomerDTO {
    private String  customerId,
                    customerName,
                    password,
                    ssn,
                    phone,
                    city,
                    address,
                    postalcode,
                    photo;
}

