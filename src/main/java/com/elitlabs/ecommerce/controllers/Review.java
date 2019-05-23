package com.elitlabs.ecommerce.controllers;


import com.elitlabs.ecommerce.models.ReviewDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class Review {

    @Autowired
    private ReviewSevice reviewSevice;

    //@CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/all")
    public List<ReviewDTO> allReviews(){
        return reviewSevice.allReviews();
    }

    @PostMapping("/add")
    public String addReviews(){
        return reviewSevice.saveReview(reviewData);
    }

    @PutMapping("/update/{id}")
    public String updateReview(){
        return reviewSevice.updateReview(id, review);
    }

    @GetMapping("/find/{id}")
    public Optional<ReviewDTO> searchReview(@PathVariable Integer review_id){
        return reviewSevice.searchReview(review_id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteReview(@PathVariable Integer review_id){
        return  reviewSevice.deleteReview();
    }

}
