package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.business;

import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging.ILogger;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.databaseAccess.IProductDao;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.BaseEntity;
import com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.entities.Category;
import com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.core.Logging.Logger;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements BaseManager{
    private ILogger[] loggers;
    private IProductDao productDao;

    private ArrayList<Category> categories;

    public CategoryManager(IProductDao productDao, ILogger[] loggers, ArrayList<Category> categories) {
        this.loggers = loggers;
        this.productDao = productDao;
        this.categories =  categories;
    }

    @Override
    public void add(BaseEntity baseEntity) throws Exception {
        if (!categories.contains(baseEntity)){
            categories.add((Category) baseEntity);
            productDao.add(baseEntity);
        }
        else
            throw new Exception("Varolan bir kategori eklediniz.");

    }
}
