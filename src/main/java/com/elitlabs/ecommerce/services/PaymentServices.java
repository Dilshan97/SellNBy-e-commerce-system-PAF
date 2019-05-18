package com.elitlabs.ecommerce.services;

import com.elitlabs.ecommerce.models.PaymentDTO;

import java.util.List;
import java.util.Optional;

public interface PaymentServices {

    List<PaymentDTO> findAllPayment();

    String savePayment(PaymentDTO paymentData);

    String updatePayment(PaymentDTO newPaymentData);

    Optional<PaymentDTO> findUByid(Integer id);
}
