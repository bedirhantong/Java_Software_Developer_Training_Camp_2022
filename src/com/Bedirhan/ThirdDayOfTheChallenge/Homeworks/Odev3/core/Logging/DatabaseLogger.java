package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Database'e loglandi "+data);
    }
}
