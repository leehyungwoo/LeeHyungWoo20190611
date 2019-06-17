package com.test.web.controller;
import com.test.web.domain.CustomerDTO;
import com.test.web.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
public class CustomerController {
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;

    @RequestMapping("/count")
    public String count() {
        System.out.println("CustomerController count() 경로로 들어옴");
        int count = customerService.countAll();
        System.out.println("고객의 총인원 : " + count);
        return count+"";
    }

    @RequestMapping("/login/{customerId}/{password}")
    public String login(@PathVariable("customerId") String id, 
                        @PathVariable("password") String pass){

        System.out.println("AJAX로 넘어온 ID : " + id);
        System.out.println("AJAX로 넘어온 password : " + pass);

        customer.setCustomerId(id);
        customer.setPassword(pass);        
        return (customerService.login(customer) != null) ?  "SUCESS" : "FAILE";  //보내는 인스턴스체
       
    }

    
}
