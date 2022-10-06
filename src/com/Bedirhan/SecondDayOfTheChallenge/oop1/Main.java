package com.Bedirhan.SecondDayOfTheChallenge.oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade orani";

        Product product1 = new Product();
        //set value
        product1.name = "Delonghi Kahve Makinesi";
        product1.unitPrice = 7500;
        product1.unitsInStock = 3;
        product1.discount = 7;
        product1.imageUrls = "bilmemne.jpg";

        Product product2 = new Product();
        product2.name = "Smeg Kahve Makinesi";
        product2.unitPrice = 6500;
        product2.unitsInStock = 2;
        product2.discount = 8;
        product2.imageUrls = "bilmemne2.jpg";

        Product product3 = new Product();
        product3.name = "Kitchen Aid Kahve Makinesi";
        product3.unitPrice = 4500;
        product3.unitsInStock = 4;
        product3.discount = 9;
        product3.imageUrls = "bilmemne3.jpg";

        //7-27 satırları arası normalde databaseden gelir, burada elle yazdıgımıza bakma

        Product[] products = {
          product1,product2,product3
        };

        System.out.println("<ul>");
        for (Product product : products ){
            System.out.println("<li>"+product.name+"</li>");
        }
        System.out.println("</ul>");

        // ul li htmlde liste yapmak için kullanılan etiketlerdir.








    }
}
