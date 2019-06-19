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
    public List<CustomerDTO> findCustomersByOption(CustomerDTO customer) {
        return null;
    }

    @Override
    public CustomerDTO findCustomerBycustomerId(String customer) {
        return null;
    }

    @Override
    public int updateCustomer(CustomerDTO customer) {
        //데이터 DML 여부판단
        int res = customerMapper.updateCustomer(customer);
        System.out.println("성공여부판단"+res);
        if(res == 1){
            System.out.println("서비스 customerMapper 수정성공 in customerServiceImpl");
        }else{
            System.out.println("서비스 customerMapper 수정실패 in customerServiceImpl");
        }
        return res;
    }

    @Override
    public void deleteCustomer(CustomerDTO customer) {
        customerMapper.deleteCustomer(customer);
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

	@Override
	public List<CustomerDTO> findCustomers() {
		return customerMapper.selectCustomers();
	}

    


    
}

 