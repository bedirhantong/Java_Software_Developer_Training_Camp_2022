package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.Polymorphism.PolymorphismDemo;

public class Main {
    public static void main(String[] args) {
//         BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DataBaseLogger(),new ConsoleLogger()};
//         for(BaseLogger baseLogger : loggers){
//             baseLogger.Log("Log mesaji");
//         }

            CustomerManager customerManager = new CustomerManager(new FileLogger());
            customerManager.add();
    }
}
