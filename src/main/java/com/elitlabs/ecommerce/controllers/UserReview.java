package com.elitlabs.ecommerce.controllers;

import com.elitlabs.ecommerce.models.UserReviewDTO;
import com.elitlabs.ecommerce.services.UserReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/item")
public class UserReview {

    @Autowired
    private UserReviewService reviewService;

    @GetMapping("/all")
    public List<UserReviewDTO> allStock(){
        return reviewService.allReviews();
    }

    @PostMapping("/add")
    public String addUserReview(@RequestBody UserReviewDTO UserReviewData){
        return reviewService.saveReview(UserReviewData);
    }

    @PutMapping("/update/{id}")
    public String updateUserReview(@PathVariable Integer id, @RequestBody UserReviewDTO reviewData){
        return reviewService.updateReview(id, reviewData);
    }

    @GetMapping("/find/{id}")
    public Optional<UserReviewDTO> searchUserReview(@PathVariable Integer id){
        return reviewService.searchReview(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserReview(@PathVariable Integer id){
        return reviewService.deleteReview(id);
    }


}
