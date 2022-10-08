package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.MathClassMethods.Example1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(Math.pow(1,2));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.abs(-32));
        System.out.println(Math.abs(-32.32));
        System.out.println(Math.floor(1.54));
        System.out.println(Math.ceil(2.03214));
        System.out.println(Math.max(312,312.2));
        System.out.println(Math.min(2123,213.213));
        System.out.println((int) (Math.random() * 10));

        // different type of creating random num

        int[] arr =  new int[6];

        Random r =  new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100); // 100 dail değil
            System.out.println("Arrayin "+(i+1)+". elemani : "+arr[i]);
        }
        System.out.println(r.nextGaussian());

        // radyan to derece
        System.out.println("0.5 radyan "+Math.toDegrees(0.5)+" derecedir");
        // dereceyi radyana çevirme
        System.out.println("90 derece "+Math.toRadians(90)+" radyandir");


        System.out.println(Math.sin(Math.toRadians(90)));
        System.out.println(Math.toDegrees(Math.asin(1)));
        // bu şekilde cos , acos ve tan, atan da bulabilirsin.;

        System.out.println(Math.PI);
        System.out.println();
        System.out.println("E tabanında logaritma");
        System.out.println(Math.log(100));
        System.out.println("10 tabanında logaritma");
        System.out.println(Math.log10(100));
        System.out.println("gönderilen değerin 1 fazlasının doğal logaritmasi");
        System.out.println(Math.log1p(1.7));

    }

}
