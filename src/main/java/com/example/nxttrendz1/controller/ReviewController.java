/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxttrendz1.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.nxttrendz1.model.Product;
import com.example.nxttrendz1.service.ReviewJpaService;
import com.example.nxttrendz1.model.Review;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class ReviewController {

    @Autowired
    public ReviewJpaService reviewService;

    @GetMapping("/reviews")
    public ArrayList<Review> getReviews() {
        return reviewService.getReviews();
    }

    @GetMapping("/reviews/{reviewId}")
    public Review getReviewById(@PathVariable("reviewId") int reviewId) {
        return reviewService.getReviewById(reviewId);
    }

    @PostMapping("/products/reviews")
    public Review addReview(@RequestBody Review review) {
        return reviewService.addReview(review);
    }

    @PutMapping("/reviews/{reviewId}")
    public Review updateReview(@PathVariable("reviewId") int reviewId, @RequestBody Review review) {
        return reviewService.updateReview(reviewId, review);
    }

    @DeleteMapping("/reviews/{reviewId}")
    public void deleteReview(@PathVariable("reviewId") int reviewId) {
        reviewService.deleteReview(reviewId);
    }

    @GetMapping("/reviews/{reviewId}/product")
    public Product getReviewProduct(@PathVariable("reviewId") int reviewId) {
        return reviewService.getReviewProduct(reviewId);
    }
}