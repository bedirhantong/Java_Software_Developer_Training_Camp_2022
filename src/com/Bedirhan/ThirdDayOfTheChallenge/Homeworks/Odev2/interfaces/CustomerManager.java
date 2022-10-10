package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.interfaces;

public class CustomerManager {
    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal iCustomerDal){
        this.customerDal = iCustomerDal;
    }


    public void add(){
        customerDal.add();
    }
}
