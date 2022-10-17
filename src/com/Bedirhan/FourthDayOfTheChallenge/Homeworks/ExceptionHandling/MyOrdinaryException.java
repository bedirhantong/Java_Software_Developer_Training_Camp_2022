package com.Bedirhan.FourthDayOfTheChallenge.Homeworks.ExceptionHandling;

import java.util.Scanner;

public class MyOrdinaryException extends Exception{
    int num = 0;
    public MyOrdinaryException(){
    }

    public String toString(String str) {
        return "MyOrdinaryException{" +
                "num=" + num +
                str;
    }
    public String toString() {
        return "MyOrdinaryException{" +
                "num=" + num +
                '}';
    }
}
class Main{
    public static void main(String[] args) throws MyOrdinaryException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = scanner.nextInt();
        System.out.println("-----------");
        if (num == 0){
            throw new MyOrdinaryException();
        }

    }
}
