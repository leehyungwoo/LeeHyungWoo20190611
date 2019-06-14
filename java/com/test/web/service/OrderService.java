package com.test.web.service;
import java.util.List;
import com.test.web.domain.OrderDTO;
import org.springframework.stereotype.Component;


/**
 * OrderService
 */
@Component
 public interface OrderService {
    public void addOrder(OrderDTO order);
    public List<OrderDTO> findOrders();
    public List<OrderDTO> findOrdersByOption(OrderDTO order);
    public OrderDTO findOrderByorderId(String order);
    public void updateOrder(OrderDTO order);
    public void deleteOrder(OrderDTO order);
}

 