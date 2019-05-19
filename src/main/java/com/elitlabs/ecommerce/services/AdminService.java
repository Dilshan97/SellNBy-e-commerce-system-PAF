package com.elitlabs.ecommerce.services;

import com.elitlabs.ecommerce.models.PaymentDTO;
import com.elitlabs.ecommerce.models.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdminService {

    List<UserDTO> allUsers();

    List<PaymentDTO> allPayments();
}
