package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.AbstractClasses.abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new MySqlDataBaseManager();
        customerManager.getCustomers();
    }
}
