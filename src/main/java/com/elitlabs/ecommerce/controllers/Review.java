package com.elitlabs.ecommerce.controllers;


import com.elitlabs.ecommerce.models.ReviewDTO;
import com.elitlabs.ecommerce.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/review")
public class Review {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/all")
    public List<ReviewDTO> allReview(){
        return reviewService.allReviews();
    }

    @PostMapping("/add")
    public String addReviews(@RequestBody ReviewDTO  reviewData){
        return reviewService.saveReview(reviewData);
    }

    @PutMapping("/update/{id}")
    public String updateReview(@PathVariable Integer id, @RequestBody ReviewDTO  reviewData){
        return reviewService.updateReview(id, reviewData);
    }

    @GetMapping("/find/{id}")
    public Optional<ReviewDTO> searchReview(@PathVariable Integer id){
        return reviewService.searchReview(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteReview(@PathVariable Integer id){
        return  reviewService.deleteReview(id);
    }

}
