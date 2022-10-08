package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.InnerClasses.Example5;

public class IslemYap {
    class OuterClass{
        public int x = 5;
        public static final int y = 5;
        public static String ad = "Mustafa";
        public static void metod1(){
            System.out.println("Metod1 is working");
        }
    }

    static class DahiliUyeSinif2{
        public int a = 11;
        public static final int b = 23;
        public static  String ad = "Emre";
        public static void metod2(){
            System.out.println("Method 2 is working");
        }
        public void metod3(){
            System.out.println("Method 3 is working");
        }
    }

    public static void main(String[] args) {
        IslemYap islemYap =  new IslemYap();
        System.out.println(OuterClass.ad);
        OuterClass.metod1();
        System.out.println(DahiliUyeSinif2.b);
        System.out.println(DahiliUyeSinif2.ad);
        DahiliUyeSinif2.metod2();

    }
}
