package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("MySql is added");
    }
    // Dal : Data access layer

}
