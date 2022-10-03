package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.Polymorphism.PolymorphismDemo;

public class ConsoleLogger extends BaseLogger{
    @Override
    public void log(String message) {
        System.out.println("Logged to Console : "+message);
    }
}
