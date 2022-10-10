package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev3.core.Logging;

public class MailLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Mail'e loglandi "+data);
    }
}
