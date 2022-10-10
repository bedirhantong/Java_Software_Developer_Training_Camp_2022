package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business;

import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging.ILogger;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess.IProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.BaseEntity;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.Course;

import java.util.ArrayList;

public class CourseManager implements BaseManager {
    private ILogger[] loggers;
    private IProductDao productDao;
    private ArrayList<Course> courses;

    public CourseManager(IProductDao productDao, ILogger[] loggers, ArrayList<Course> courses) {
        this.loggers = loggers;
        this.productDao = productDao;
        this.courses =  courses;
    }

    @Override
    public void add(BaseEntity baseEntity) throws Exception {
        if (!courses.contains(baseEntity)  && !(((Course) baseEntity).get_price() <10)  ){
            courses.add((Course) baseEntity);
            productDao.add(baseEntity);
        }
        else
            throw new Exception("Varolan bir kursu eklediniz veya negatif bir kurs ucreti girdiniz.");
    }

}
