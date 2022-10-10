package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess;

import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.BaseEntity;

public class JdbcDao implements IProductDao{
    @Override
    public void add(BaseEntity baseEntity) {
        System.out.println("JDBC ile veri tabanina "+baseEntity.get_name()+" eklendi.");
    }
}
