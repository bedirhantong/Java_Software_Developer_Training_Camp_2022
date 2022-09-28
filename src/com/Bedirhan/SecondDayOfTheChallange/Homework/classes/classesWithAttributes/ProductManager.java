package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.classesWithAttributes;

public class ProductManager {
    Product product;
    public void addToCart(Product product) {
        System.out.println("Sepete eklendi : " + product.getName());
    }

    public void removeFromCart(Product product) {
        System.out.println("Sepetten " + product.getName() + " removed.");
    }


}
