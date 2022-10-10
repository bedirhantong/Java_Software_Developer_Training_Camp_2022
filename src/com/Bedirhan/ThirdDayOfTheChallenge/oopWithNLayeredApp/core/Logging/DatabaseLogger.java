package com.Bedirhan.ThirdDayOfTheChallenge.oopWithNLayeredApp.core.Logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Database'e loglandi "+data);
    }
}
