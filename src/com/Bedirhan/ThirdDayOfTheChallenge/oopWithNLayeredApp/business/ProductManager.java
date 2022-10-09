package com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.business;

import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.dataAccess.ProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;

    public ProductManager(ProductDao productDao) {
        this.productDao =  productDao;
    }


    public void add(Product product) throws Exception {
        // işle alakalı kodlar buraya yazılır
        if (product.get_unitPrice() < 10){
            throw new Exception("Ürün fiyati 10 dan kucuk olamaz");
        }
//        ProductDao jdbcProductDao = new HibernateProductDao();
        productDao.add(product);

    }
}
