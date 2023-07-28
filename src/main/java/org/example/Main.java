package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome in our Shooping app");
         product prodcut1=new product(1,"Nike",2000);
        product prodcut2=new product(2,"Adidas",1000);

        product prodcut3=new product(3,"Adidas",1000);
        product prodcut4=new product(4,"bata",500);

        user user1=new user(1,"kalpesh",26,"Kalyan");

        user1.getCartItems().addItem(prodcut1);
        user1.getCartItems().addItem(prodcut2);
        user1.getCartItems().addItem(prodcut3);


        System.out.println("Cart Item for"+user1.GetName()+":");
        for(product prod:user1.getCartItems().cartItems){
            System.out.println(prod.getProductName()+" - rs"+prod.getPrice());
        }
        System.out.println("total price is:"+ user1.getCartItems().getTotalPrice());

        user1.getCartItems().CheckOut();

        System.out.println("cart item after checkout for "+user1.GetName());
        for(product prod:user1.getCartItems().cartItems){
            System.out.println(prod.getProductName()+"rs"+prod.getPrice());
        }
        System.out.println("total price after checkout is:"+ user1.getCartItems().getTotalPrice());

    }
}