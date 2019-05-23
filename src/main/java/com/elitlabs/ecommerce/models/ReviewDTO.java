package com.elitlabs.ecommerce.models;

import org.hibernate.annotations.Table;
import javax.persistence.*;

@Entity
@Table(name="Review")
public class ReviewDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer review_id;
    private String review_product_name;
    private String seller_name;
    private String review_marks;

    public Integer getReview_id() {
        return review_id;
    }

    public void setreview_id(Integer review_id) {
        this.review_id = review_id;
    }

    public String getreview_product_name() {
        return review_product_name;
    }

    public void setReview_product_name(String review_product_name) {
        this.review_product_name = review_product_name;
    }

    public String getseller_name() {
        return seller_name;
    }

    public void setseller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public String getreview_marks() {
        return review_marks;
    }

    public void setreview_marks(String review_marks) {
        this.review_marks = review_marks;
    }




}
