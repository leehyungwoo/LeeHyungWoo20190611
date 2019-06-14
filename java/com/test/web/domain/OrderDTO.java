package com.test.web.domain;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;
import lombok.Data;

/**
 * OrderDTO
 */
@Data @Component @Lazy
public class OrderDTO {
    private String  orderId,
                    customerId,
                    employeeId,
                    orderDate,
                    shipperId;


    
}

