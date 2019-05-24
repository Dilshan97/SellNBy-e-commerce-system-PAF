package com.elitlabs.ecommerce.models;

import javax.persistence.*;

@Entity
@Table(name="Review")
public class ReviewDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "review_id")
    private Integer review_id;

    @Column(name = "item_id")
    private String item_id;

    @Column(name = "product")
    private String review_product_name;

    @Column(name = "seller")
    private String seller_name;

    @Column(name = "reviews")
    private String review_marks;

    public Integer getReview_id() {
        return review_id;
    }

    public void setReview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public String getReview_product_name() {
        return review_product_name;
    }

    public void setReview_product_name(String review_product_name) {
        this.review_product_name = review_product_name;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getReview_marks() {
        return review_marks;
    }

    public void setReview_marks(String review_marks) {
        this.review_marks = review_marks;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
}
