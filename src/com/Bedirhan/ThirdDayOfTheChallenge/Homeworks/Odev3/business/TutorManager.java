package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business;

import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging.ILogger;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess.IProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.BaseEntity;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.Tutor;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.core.Logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class TutorManager implements BaseManager{

    private ILogger[] loggers;
    private IProductDao productDao;
    private ArrayList<Tutor> tutors;

    public TutorManager(IProductDao productDao, ILogger[] loggers, ArrayList<Tutor> tutors) {
        this.loggers = loggers;
        this.productDao = productDao;
        this.tutors =  tutors;
    }

    @Override
    public void add(BaseEntity baseEntity) throws Exception {
        if (!tutors.contains(baseEntity) ){
            tutors.add((Tutor) baseEntity);
            productDao.add(baseEntity);
        }else
            throw new Exception("Varolan bir egitmeni eklemeye calistiniz.");
    }

}
