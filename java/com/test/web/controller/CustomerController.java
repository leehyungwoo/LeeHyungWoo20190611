package com.test.web.controller;

import java.util.HashMap;

import com.test.web.domain.CustomerDTO;
import com.test.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;

    @RequestMapping("/count")
    public String count() {
        System.out.println("CustomerController count() 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " + count);
        return count + "";
    }

    @PostMapping("")
    public HashMap<String,Object> join(@RequestBody CustomerDTO param) {
        System.out.println("======post mapping ========");        
        customer.setCustomerId(param.getCustomerId());
        customer.setCustomerName(param.getCustomerName());
        customer.setPassword(param.getPassword());
        customer.setSsn(param.getSsn());
        customer.setPhone(param.getPhone());
        customer.setCity(param.getCity());
        customer.setAddress(param.getAddress());
        customer.setPostalcode(param.getPostalcode());
        customerService.insertCustomer(customer);
        HashMap<String,Object> map = new HashMap<>();
        map.put("result","SUCESS");
        return map;
    }
    
    @GetMapping("/{customerId}/{password}")
    public CustomerDTO login(@PathVariable("customerId") String id, 
                @PathVariable("password") String pass){        
        System.out.println("AJAX로 넘어온 ID : " + id);
        System.out.println("AJAX로 넘어온 password : " + pass);
        customer.setCustomerId(id);
        customer.setPassword(pass);        
        return customerService.login(customer);  
    }

   
    @GetMapping("/{customerId}")  //
    public CustomerDTO selectUser(@PathVariable("customerId") String id ){
        System.out.println("======select mapping ========");
        System.out.println("AJAX로 넘어온 ID : " + id);
        customer.setCustomerId(id);
        return customerService.findCustomerBycustomerId(id);
    }

    @PutMapping("/{customerId}") //
    public HashMap<String,Object> updateUser(@RequestBody CustomerDTO param) {
        System.out.println("======update mapping ========");
        System.out.println("AJAX로 넘어온 ID : " + param.getCustomerId());
        System.out.println("AJAX로 넘어온  : " + param.getCustomerName());
        System.out.println("AJAX로 넘어온  : " + param.getPassword());
        System.out.println("AJAX로 넘어온  : " + param.getSsn());
        System.out.println("AJAX로 넘어온  : " + param.getPhone());
        System.out.println("AJAX로 넘어온  : " + param.getCity());
        System.out.println("AJAX로 넘어온  : " + param.getAddress());
        System.out.println("AJAX로 넘어온  : " + param.getPostalcode());
        
       
        customer.setCustomerId(param.getCustomerId());
        customer.setCustomerName(param.getCustomerName());
        customer.setPassword(param.getPassword());
        customer.setSsn(param.getSsn());
        customer.setPhone(param.getPhone());
        customer.setCity(param.getCity());
        customer.setAddress(param.getAddress());
        customer.setPostalcode(param.getPostalcode());

        customerService.updateCustomer(customer);
        HashMap<String,Object> map = new HashMap<>();
        map.put("result","SUCESS");
        return map;

    }

    // @DeleteMapping("/{customerId}") //
    // public HashMap<String,Object> deleteUser(@PathVariable("customerId") String id) {
    //     System.out.println("======delete mapping ========");
    //     System.out.println("AJAX로 넘어온 ID : " + id);
    //     customer.setCustomerId(id);

    //     HashMap<String,Object> map = new HashMap<>();
    //     map.put("result","SUCESS");
    //     return map; 
    // }

    
}
