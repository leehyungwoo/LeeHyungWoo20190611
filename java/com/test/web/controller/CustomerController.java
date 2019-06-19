package com.test.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    // @RequestMapping("/count")
    // public String count() {
    //     System.out.println("CustomerController count() 경로로 들어옴");
    //     int count = customerService.countAll();
    //     System.out.println("고객의 총인원 : " + count);
    //     return count + "";
    // }

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
    
    @GetMapping("/all") //전체가져오기
    public List<CustomerDTO> list(){   //import util로
        System.out.println("도착");
        List<CustomerDTO> list = new ArrayList<>();
        list = customerService.findCustomers();
        for(CustomerDTO customer :list){
            System.out.println(customer);
            System.out.println("\n");
        }
        
  
        return list;
    }


    @GetMapping("/{customerId}/{password}") //유저
    public CustomerDTO login(@PathVariable("customerId") String id, 
                @PathVariable("password") String pass){        
        System.out.println("AJAX로 넘어온 ID : " + id);
        System.out.println("AJAX로 넘어온 password : " + pass);
        customer.setCustomerId(id);
        customer.setPassword(pass);        
        return customerService.login(customer);  
    }

    @GetMapping("/{customerId}")  //
    public CustomerDTO selectUser(@PathVariable("customerId") String customerId ){
        System.out.println("======select mapping ========");
        System.out.println("AJAX로 넘어온 ID : " + customerId);
        customer.setCustomerId(customerId);
        return customerService.findCustomerBycustomerId(customerId);
    }

    @PutMapping("/{customerId}") //
    public CustomerDTO  updateUser(@RequestBody CustomerDTO param) {
        System.out.println("======update mapping ========");
        System.out.println("수정 할 객체 : " + param.toString());
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


        //데이터 DML 여부판단
        int res = customerService.updateCustomer(param);
            System.out.println("====>" + res);
            if(res == 1){
                customer = customerService.findCustomerBycustomerId(param.getCustomerId());
            }else{
                System.out.println("컨트롤러 수정 실패");
            }
            return customer;
    }

    @DeleteMapping("/{customerId}") //
    public HashMap<String,Object> deleteUser(@PathVariable("customerId") String customerId) {
        System.out.println("======delete mapping ========");
        System.out.println("AJAX로 넘어온 ID : " + customerId);

        HashMap<String,Object> map = new HashMap<>();
        customer.setCustomerId(customerId);
        customerService.deleteCustomer(customer);
        map.put("result","SUCESS");
        return map; 
    }

    
}
