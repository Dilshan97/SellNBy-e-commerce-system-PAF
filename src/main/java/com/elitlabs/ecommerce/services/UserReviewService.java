package com.elitlabs.ecommerce.services;

import com.elitlabs.ecommerce.models.ItemDTO;
import com.elitlabs.ecommerce.models.UserReviewDTO;

import java.util.List;
import java.util.Optional;

public interface UserReviewService {

    List<UserReviewDTO> allReviews();

    String saveReview(UserReviewDTO reviewData);

    String updateReview(Integer id, UserReviewDTO reviewData);

    Optional<UserReviewDTO> searchReview(Integer id);

    String deleteReview(Integer id);

}
