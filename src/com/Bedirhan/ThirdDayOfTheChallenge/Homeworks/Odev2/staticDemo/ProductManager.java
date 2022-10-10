package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.staticDemo;

public class ProductManager {
    public void add(Product product){
        if (ProductValidator.isValid(product)){
            System.out.println("Added.");
        }
        else {
            System.out.println("Product informations is not valid");
        }
    }
}

