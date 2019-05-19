package com.elitlabs.ecommerce.repositories;

import com.elitlabs.ecommerce.models.ItemDTO;
import com.elitlabs.ecommerce.models.UserReviewDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReviewRepository extends JpaRepository<UserReviewDTO, Integer> {
}
