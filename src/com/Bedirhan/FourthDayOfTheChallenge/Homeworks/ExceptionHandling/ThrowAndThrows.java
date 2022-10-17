package com.Bedirhan.FourthDayOfTheChallenge.Homeworks.ExceptionHandling;

public class ThrowAndThrows {
    static int sayiBol(int num1,int num2){
        if (num2 == 2){
            throw new IllegalArgumentException();
        }
        else return num1/num2;
    }
    public static void main(String[] args) throws IllegalArgumentException,ArithmeticException {
        System.out.println(sayiBol(3,2));
        System.out.println(sayiBol(4,1));
    }
}
