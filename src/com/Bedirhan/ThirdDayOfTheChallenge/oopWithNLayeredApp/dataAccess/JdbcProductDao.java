package com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.dataAccess;

import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product){
        // sadece ve sadece db erişim kodları buraya yazılır.../ SQL bilmen gerekecek.
        System.out.println("JDBC ile veri tabanina "+ product.get_name()+" eklendi");
    }
}