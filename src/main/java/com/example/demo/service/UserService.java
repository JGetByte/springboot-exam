/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.User;

/**
 *
 * @author cpiyawut
 */
public interface UserService {
    
    public User findByEmail(String email);
    
    
}
