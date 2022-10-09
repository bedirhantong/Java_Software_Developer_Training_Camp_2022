package com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp;

import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.business.ProductManager;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 =  new Product(1,"IPHONE XR",10000);
        ProductManager productManager =  new ProductManager(new HibernateProductDao());
        productManager.add(product1);
    }
}
