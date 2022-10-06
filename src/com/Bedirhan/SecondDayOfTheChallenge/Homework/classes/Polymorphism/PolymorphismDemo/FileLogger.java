package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.Polymorphism.PolymorphismDemo;

public class FileLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to fileLogger : "+message);
    }
}
