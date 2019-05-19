package com.elitlabs.ecommerce.models;

import javax.persistence.*;

@Entity
@Table(name="Review")
public class UserReviewDTO {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Integer id;

    @Column(name="seller_name")
    private String seller_name ;

    @Column(name="item_code")
    private String item_code;

    @Column(name="status")
    private String status;

    @Column(name="desc")
    private String description;

    @Column(name="Customer_id")
    private Integer customer_id;


    public Integer getId() {
        return id;
    }

    public String getSeller_name() {
        return seller_name;
    }

    public String getItem_code() {
        return item_code;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSeller_name(String seller_name) {
        this.seller_name = seller_name;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
}
