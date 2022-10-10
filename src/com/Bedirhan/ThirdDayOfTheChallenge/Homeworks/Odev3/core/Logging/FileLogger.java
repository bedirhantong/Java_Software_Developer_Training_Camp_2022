package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("File'a loglandi "+data);
    }
}
