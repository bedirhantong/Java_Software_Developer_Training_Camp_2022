package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.staticDemo;

public class ProductValidator {
    public ProductValidator(){
        System.out.println("Yapici Blok newlenenler icin calisti");
    }

    static {
        System.out.println("Yapici blok statikler icin calisti 1");
    }

    public static boolean isValid(Product product){
        return product.price > 0 && !product.name.isEmpty();
    }

    public void  bisey(){}


    public static class BaskaBirClass{
        public static void Delete(){
            System.out.println("Deleted");
        }
    }
}
