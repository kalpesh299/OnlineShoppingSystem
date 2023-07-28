package org.example;

public class user {
    private Integer Userid;
    private String name;
    private Integer age;
    private String address;
    private cart cartItems;

    user(Integer UserId, String name, Integer age, String address){
        this.Userid=UserId;
        this.name=name;
        this.age=age;
        this.address=address;
        this.cartItems=new cart();
    }

    public Integer getUserId(){
        return Userid;
    }

    public String GetName(){
        return name;
    }

    public Integer GetAge(){
        return age;
    }

    public String GetAddress(){
        return address;
    }

    public cart getCartItems(){
        return cartItems;
    }

}
