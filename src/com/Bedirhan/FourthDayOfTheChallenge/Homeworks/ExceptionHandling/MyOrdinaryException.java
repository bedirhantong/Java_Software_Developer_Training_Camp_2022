package com.Bedirhan.FourthDayOfTheChallenge.Homeworks.ExceptionHandling;

import java.util.Arrays;
import java.util.Scanner;

public class MyOrdinaryException extends Exception{
    int num = 0;
    public MyOrdinaryException(){
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
        try {
            if (num == 0){
                throw new MyOrdinaryException();
            }
        }
        catch (MyOrdinaryException e){
            System.out.println(e.getLocalizedMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println("Devammmmmmm");
    }
}
