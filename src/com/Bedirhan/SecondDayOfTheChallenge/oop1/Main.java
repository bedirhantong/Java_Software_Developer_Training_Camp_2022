package com.Bedirhan.SecondDayOfTheChallenge.oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade orani";

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrls("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrls("image3.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrls("image3.jpg");

        Product[] products = {
              product1,product2,product3
        };

        System.out.println("<ul>");
        for (Product product : products ){
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");

        // ul li htmlde liste yapmak için kullanılan etiketlerdir.

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.set_id(1);
        individualCustomer.set_phone("0514352345");
        individualCustomer.set_customerNumber("123");
        individualCustomer.setFirstName("Bedirhan");
        individualCustomer.set_lastName("Tonğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.set_id(2);
        corporateCustomer.set_companyName("Kodlama.io");
        corporateCustomer.set_phone("0533333333");
        corporateCustomer.set_taxNumber("1111111");
        corporateCustomer.set_customerNumber("54321");

        Customer[] customers = {
            individualCustomer,corporateCustomer
        };




    }
}
