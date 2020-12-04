/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cpiyawut
 */
@RestController
public class HelloController {
    
    @Autowired
    private UserService userService;
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/hello")
    public Map<String, String> getHello() {
        Map<String,String> hello = new HashMap<>();
        User user = userService.findByEmail("pchiradejnunt@gmail.com");
        System.out.println("name" + user.getName());
        hello.put("name", user.getName());
        hello.put("email", user.getEmail());
        
        return hello;
    }
}
