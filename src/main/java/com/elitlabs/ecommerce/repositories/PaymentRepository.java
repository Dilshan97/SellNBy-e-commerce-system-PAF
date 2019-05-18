package com.elitlabs.ecommerce.repositories;

import com.elitlabs.ecommerce.models.PaymentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentDTO, Integer> {

}
