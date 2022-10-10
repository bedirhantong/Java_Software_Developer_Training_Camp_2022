package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.InnerClasses.Example6;

public class Local {
//    Yerel[] y; referans olarak bile tutulamıyor

    public void run() {
        class Yerel {
            int a;

            Yerel(int a) {
                this.a = a;
            }

            public void print() {
                System.out.println(a);
            }
        }
        Yerel y =  new Yerel(10);
        y.print();
    }
}
