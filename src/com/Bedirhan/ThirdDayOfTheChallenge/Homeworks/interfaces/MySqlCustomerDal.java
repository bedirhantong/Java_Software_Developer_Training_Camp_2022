package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("MySql is added");
    }
    // Dal : Data access layer

}
