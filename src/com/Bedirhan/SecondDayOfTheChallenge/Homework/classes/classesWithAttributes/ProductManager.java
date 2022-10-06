package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.classesWithAttributes;

public class ProductManager {
    Product product;
    public void addToCart(Product product) {
        System.out.println("Sepete eklendi : " + product.get_name());
    }

    public void removeFromCart(Product product) {
        System.out.println("Sepetten " + product.get_name() + " removed.");
    }


}
