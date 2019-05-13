package com.elitlabs.ecommerce.models;

import javax.persistence.*;

@Entity
@Table(name="Item")
public class ItemDTO {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Integer item_id;
     private String item_name;
     private String item_desc;
     private String seller;
     private Integer stock;
     private Double unit_price;
     private boolean status;

     public Integer getItem_id() {
        return item_id;
    }

     public void setItem_id(Integer item_id) {
        this.item_id = item_id;
    }

     public String getItem_name() {
        return item_name;
    }

     public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

     public String getItem_desc() {
        return item_desc;
    }

     public void setItem_desc(String item_desc) {
        this.item_desc = item_desc;
    }

     public String getSeller() {
        return seller;
    }

     public void setSeller(String seller) {
        this.seller = seller;
    }

     public Integer getStock() {
        return stock;
    }

     public void setStock(Integer stock) {
        this.stock = stock;
    }

     public Double getUnit_price() {
        return unit_price;
    }

     public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

     public boolean isStatus() {
        return status;
    }

     public void setStatus(boolean status) {
        this.status = status;
    }
}
