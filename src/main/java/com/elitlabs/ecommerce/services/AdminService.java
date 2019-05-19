package com.elitlabs.ecommerce.services;

import com.elitlabs.ecommerce.models.PaymentDTO;
import com.elitlabs.ecommerce.models.UserDTO;

import java.util.List;

public interface AdminService {

    List<UserDTO> allUsers();

    List<PaymentDTO> allPayments();
}
