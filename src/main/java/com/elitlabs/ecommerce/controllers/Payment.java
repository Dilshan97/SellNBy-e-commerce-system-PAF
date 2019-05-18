package com.elitlabs.ecommerce.controllers;

import com.elitlabs.ecommerce.models.PaymentDTO;
import com.elitlabs.ecommerce.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController //api endpoint call karanna ona wenawa
@RequestMapping("/payment") // api end point eka sadaha
public class Payment {

    @Autowired
    private PaymentServices paymentServices;

    @GetMapping("/all")
    public List<PaymentDTO> allPayment() {
        return paymentServices.findAllPayment();
    }

    @PostMapping("/add")
    public String addPayment(@RequestBody PaymentDTO PamyentData) {
        return paymentServices.savePayment(PamyentData);
    }

    @PutMapping("/update")
    public String updatePayment(@RequestBody PaymentDTO newPamentData) {
        return paymentServices.updatePayment(newPamentData);
    }

    @GetMapping("/find/{id}")
    public Optional<PaymentDTO> getPaymentById(@PathVariable Integer id) {
        return paymentServices.findUByid(id);
    }
}
