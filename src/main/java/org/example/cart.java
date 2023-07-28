package org.example;

import java.util.ArrayList;

public class cart {
    ArrayList<product>cartItems;
    cart(){
        this.cartItems=new ArrayList<>();
    }

    public void addItem(product Product){
        cartItems.add(Product);
    }
    public void RemoveItem(product Product){
        cartItems.remove(Product);
    }

    public Integer getTotalPrice(){
        Integer totalPrice=0;
        for(product Productt:cartItems){
            totalPrice+=Productt.getPrice();
        }
        return totalPrice;
    }

    public void CheckOut(){
        System.out.println("Order Placed Successfully");
        cartItems.clear();
    }

}
