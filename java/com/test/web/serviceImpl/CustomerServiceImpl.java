package com.test.web.serviceImpl;
import java.util.List;
import com.test.web.domain.CustomerDTO;
import com.test.web.mapper.CustomerMapper;
import com.test.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerServiceImpl
 */
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired CustomerMapper customerMapper;
    
    @Override
    public void insertCustomer(CustomerDTO customer) {
        customerMapper.insertCustomer(customer);
    }

    @Override
    public List<CustomerDTO> findCustomers() {
        return null;
    }

    @Override
    public List<CustomerDTO> findCustomersByOption(CustomerDTO customer) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerBycustomerId(String customer) {
        return null;
    }

    @Override
    public void updateCustomer(CustomerDTO customer) {
        customerMapper.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {

    }

    @Override
    public int countAll() {
		return customerMapper.selectCount();
    }

    @Override
    public CustomerDTO login(CustomerDTO customer) {
        System.out.println(customer.getCustomerId());
        System.out.println(customer.getPassword());

        return customerMapper.login(customer);
    }

    


    
}

 