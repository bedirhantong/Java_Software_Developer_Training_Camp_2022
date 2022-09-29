package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.reCapDemo_Classes;

public class CalcApp {
    private Calculator calculator;
    public CalcApp(){
        calculator = new Calculator(2,"black");
    }
    public final int add(final int number1,final int number2){
        return number1 + number2;
    }
    public int subtract(int number1, int number2){
        return number1 - number2;
    }
    public int multiply(int number1, int number2){
        return number1 * number2;
    }
    public int divide(int number1, int number2){
        return number1 / number2;
    }

}
