package com.elitlabs.ecommerce.repositories;

import com.elitlabs.ecommerce.models.ReviewDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<ReviewDTO, Integer>{

}
