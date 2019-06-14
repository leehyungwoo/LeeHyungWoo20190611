package com.test.web.serviceImpl;
import java.util.List;
import com.test.web.domain.OrderDTO;
import com.test.web.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * OrderServiceImpl
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public void addOrder(OrderDTO order) {

    }

    @Override
    public List<OrderDTO> findOrders() {
        return null;
    }

    @Override
    public List<OrderDTO> findOrdersByOption(OrderDTO order) {
        return null;
    }

    @Override
    public OrderDTO findOrderByorderId(String order) {
        return null;
    }

    @Override
    public void updateOrder(OrderDTO order) {

    }

    @Override
    public void deleteOrder(OrderDTO order) {

    }

    
}

 