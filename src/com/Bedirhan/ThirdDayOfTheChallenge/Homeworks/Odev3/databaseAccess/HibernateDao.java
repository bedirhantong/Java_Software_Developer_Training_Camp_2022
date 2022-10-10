package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess;

import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.BaseEntity;

public class HibernateDao implements IProductDao{

    @Override
    public void add(BaseEntity baseEntity) {
        System.out.println("Hibernate ile veri tabanina "+baseEntity.get_name()+" eklendi.");
    }
}
