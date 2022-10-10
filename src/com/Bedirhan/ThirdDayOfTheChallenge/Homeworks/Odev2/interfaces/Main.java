package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager =  new CustomerManager(new MySqlCustomerDal());
         customerManager.add();
    }
}
