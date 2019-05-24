package com.elitlabs.ecommerce.services.implementation;

import com.elitlabs.ecommerce.models.ReviewDTO;
import com.elitlabs.ecommerce.repositories.ReviewRepository;
import com.elitlabs.ecommerce.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<ReviewDTO> allReviews() {
        List<ReviewDTO> allReview = reviewRepository.findAll();
        return allReview;
    }

    @Override
    public String saveReview(ReviewDTO reviewData) {
        reviewRepository.save(reviewData);
        return "Review Added";
    }

    @Override
    public String updateReview(Integer id, ReviewDTO reviewData) {

        String msg = null;

        if(reviewRepository.findById(id) != null){
            reviewRepository.save(reviewData);
            msg = "Review updated";
        }
        else {
            msg = "Can't Update Review";
        }
        return msg;
    }

    @Override
    public Optional<ReviewDTO> searchReview(Integer id) {
        return reviewRepository.findById(id);
    }

    @Override
    public String deleteReview(Integer id) {
        reviewRepository.deleteById(id);
        return "Review Deleted";
    }
}
