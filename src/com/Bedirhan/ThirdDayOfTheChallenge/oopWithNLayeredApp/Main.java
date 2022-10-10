package com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp;

import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.business.ProductManager;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.core.Logging.DatabaseLogger;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.core.Logging.FileLogger;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.core.Logging.Logger;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.core.Logging.MailLogger;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 =  new Product(1,"IPHONE XR",10000);
        Logger[] loggers =  {
                new DatabaseLogger(),new FileLogger(),new MailLogger()
        };
        ProductManager productManager =  new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}
