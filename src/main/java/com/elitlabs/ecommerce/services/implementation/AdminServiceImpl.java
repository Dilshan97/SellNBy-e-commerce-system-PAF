package com.elitlabs.ecommerce.services.implementation;

import com.elitlabs.ecommerce.models.PaymentDTO;
import com.elitlabs.ecommerce.models.UserDTO;
import com.elitlabs.ecommerce.repositories.PaymentRepository;
import com.elitlabs.ecommerce.repositories.UserRepository;
import com.elitlabs.ecommerce.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdminServiceImpl implements AdminService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<UserDTO> allUsers() {
        List<UserDTO> allusers = userRepository.findAll();
        return allusers;
    }

    @Override
    public List<PaymentDTO> allPayments() {
        List<PaymentDTO> allpaymets = paymentRepository.findAll();
        return allpaymets;
    }
}
