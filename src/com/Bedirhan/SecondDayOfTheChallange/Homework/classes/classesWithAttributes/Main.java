package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop","Asus TUF Gaming",14500,3);
        ProductManager productManager = new ProductManager();

        productManager.addToCart(product1);
        productManager.removeFromCart(product1);
        System.out.println(product1.getKod());
    }
}
