package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.AbstractClasses.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySqlDataBaseManager();
        customerManager.getCustomers();
    }
}
