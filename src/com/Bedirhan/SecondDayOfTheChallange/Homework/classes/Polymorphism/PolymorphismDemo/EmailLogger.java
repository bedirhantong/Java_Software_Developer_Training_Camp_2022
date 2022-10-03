package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.Polymorphism.PolymorphismDemo;

import java.util.logging.Logger;

public class EmailLogger extends BaseLogger {
    public void log(String message){
        System.out.println("Logged to emailLogger : "+message);
    }

}
