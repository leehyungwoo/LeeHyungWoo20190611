package com.test.web.controller;

import com.test.web.domain.EmployDTO;
import com.test.web.service.EmployService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * EmployController
 */
public class EmployController {
    @Autowired EmployService service;
    @Autowired EmployDTO Employ;
    @RequestMapping("/employ")
    public String index() {
        System.out.println("employ 페이지");
        return "index";
    }

    @GetMapping("/{employeeId}")
    public EmployDTO getEmploy(@PathVariable String id) {
        
        return Employ;
    }


}