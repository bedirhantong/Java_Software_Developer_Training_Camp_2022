package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.reCapDemo_Classes;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4,7));
        System.out.println(calculator.divide(10,4));
        System.out.println(calculator.multiply(4,2));
        System.out.println(calculator.subtract(43,2));

        System.out.println(calculator.toString());
    }
}
