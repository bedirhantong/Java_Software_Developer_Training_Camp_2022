package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.InnerClasses.Example6;

public class Nonstatic {
    private int a = 10;

    public class Inner{
        int a = 1;

        public void run(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(Nonstatic.this.a);
        }
    }

    public void run(){
        System.out.println(a);
        System.out.println(this.a);
        Inner inner =  new Inner();
        System.out.println(inner.a);
    }
}
