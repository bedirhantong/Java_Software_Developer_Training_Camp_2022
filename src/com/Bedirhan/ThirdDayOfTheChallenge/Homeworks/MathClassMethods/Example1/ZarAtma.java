package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.MathClassMethods.Example1;

import java.util.Random;
import java.util.Scanner;

public class ZarAtma {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random r =  new Random();
        do {
            int sayi1 = r.nextInt(6);
            sayi1 += 1;
            int sayi2 = r.nextInt(6);
            sayi2 += 1;
            System.out.println("sayilar " + sayi1 + " - " + sayi2);
            System.out.println("Devam mi");
        } while (!scanner.nextLine().equalsIgnoreCase("no"));
    }
}
