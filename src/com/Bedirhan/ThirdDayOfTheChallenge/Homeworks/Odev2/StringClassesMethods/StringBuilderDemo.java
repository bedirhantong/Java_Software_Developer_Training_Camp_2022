package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.StringClassesMethods;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Bedirhan");
        stringBuilder.append(" ").append(22).append(" yasindadir.");


        stringBuilder.replace(0,8,"nahrideB");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
