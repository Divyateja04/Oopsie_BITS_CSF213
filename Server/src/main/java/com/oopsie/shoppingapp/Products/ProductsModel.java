package com.oopsie.shoppingapp.Products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class ProductsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "price")
    private double price;

    @Column(name = "quantity")
    private Long quantity;

    @Column(name = "rating")
    private double rating;

    @Column(name= "details")
    private String details;

    public String getId() {
        return productId;
    }

    public void setId(String id) {
        this.productId = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return quantity;
    }

    public double getRating(){
        return rating;
    }
    public double setRating(double rating){
        this.rating=rating;
    }

    public String getDetails()
    {
        return details;
    }
    public String setDetails(String details)
    {
        this.details =  details;
    }

    public void setQty(int quantity) {
        this.quantity = quantity;
    }
    
}

