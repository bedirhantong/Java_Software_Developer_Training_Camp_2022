package com.Bedirhan.SecondDayOfTheChallange.Homework.classes;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager1 = new CustomerManager();
        customerManager1 = customerManager;
        customerManager.add();
        customerManager.remove();
        customerManager.update();


        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10,20,30};
        sayilar1 = sayilar2;
        sayilar1[0] = 100;
        System.out.println(sayilar2[0]);
    }

}
