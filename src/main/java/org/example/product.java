package org.example;

public class product {
    private Integer productId;
    private String productName;
    private Integer price;

    product(Integer productId,String productName,Integer price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }

    public Integer getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getProductId() {
        return productId;
    }
}
