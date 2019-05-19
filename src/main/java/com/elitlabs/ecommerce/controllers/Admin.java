package com.elitlabs.ecommerce.controllers;

import com.elitlabs.ecommerce.models.PaymentDTO;
import com.elitlabs.ecommerce.models.UserDTO;
import com.elitlabs.ecommerce.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin")
public class Admin {

    @Autowired
    private AdminService adminService;

    @GetMapping("/all-users")
    public List<UserDTO> allUsers(){
        return adminService.allUsers();
    }

    @GetMapping("/all-payments")
    public List<PaymentDTO> allPayments(){
        return adminService.allPayments();
    }
}
