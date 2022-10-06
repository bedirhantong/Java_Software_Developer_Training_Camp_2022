package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.Polymorphism.PolymorphismDemo;

public class DataBaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to database : "+message);
    }
}
