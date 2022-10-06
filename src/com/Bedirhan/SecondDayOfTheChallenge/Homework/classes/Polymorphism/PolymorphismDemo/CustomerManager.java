package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.Polymorphism.PolymorphismDemo;

public class CustomerManager {
    private final BaseLogger _baseLogger;

    public CustomerManager(BaseLogger baseLogger){
        _baseLogger= baseLogger;
    }
    public void add(){
        System.out.println("Customer Added");
        _baseLogger.log("Log mesaji");
    }
}
