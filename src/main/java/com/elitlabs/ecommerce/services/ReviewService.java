package com.elitlabs.ecommerce.services;

import com.elitlabs.ecommerce.models.ReviewDTO;

import java.util.List;
import java.util.Optional;

public interface ReviewService {

    List<ReviewDTO> allReviews();

    String saveReview(ReviewDTO reviewData);

    String updateReview(Integer id, ReviewDTO reviewData);

    Optional<ReviewDTO> searchReview(Integer id);

    String deleteReview(Integer id);
}
