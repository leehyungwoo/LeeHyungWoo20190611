package com.test.web.service;
import java.util.List;
import com.test.web.domain.CustomerDTO;
import org.springframework.stereotype.Component;


/**
 * CustomerService
 */
@Component
 public interface CustomerService {   
    public void insertCustomer(CustomerDTO customer);
    public List<CustomerDTO> findCustomers();
    public List<CustomerDTO> findCustomersByOption(CustomerDTO customer);
    public CustomerDTO findCustomerBycustomerId(String customer);
    public int updateCustomer(CustomerDTO customer);
    public void deleteCustomer(CustomerDTO customer);
    public int countAll();
    public CustomerDTO login(CustomerDTO customer);

}

 