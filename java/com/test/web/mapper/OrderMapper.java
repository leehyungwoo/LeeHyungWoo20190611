package com.test.web.mapper;
import java.util.List;
import com.test.web.domain.OrderDTO;
import org.springframework.stereotype.Repository;

/**
 * OrderMapper
 */
@Repository
public interface OrderMapper {
    public void insertOrder(OrderDTO order);
    public List<OrderDTO> selectOrders();
    public List<OrderDTO> selectOrdersByOption(OrderDTO order);
    public OrderDTO selectOrderByorderId(String order);
    public void updateOrder(OrderDTO order);
    public void deleteOrder(OrderDTO order);   
}