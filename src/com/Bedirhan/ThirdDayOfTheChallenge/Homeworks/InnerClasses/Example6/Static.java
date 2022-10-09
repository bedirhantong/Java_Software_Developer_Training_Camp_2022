package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.InnerClasses.Example6;

public class Static {
    private int a = 10;
    private static int b = 2;
    public static class Inner{
        int a = 1;
        public void run(){
            System.out.println(a);
            System.out.println(this.a);
//            System.out.println(Static.this.a); cause an error

            System.out.println(Static.b);
            Inner.print();
        }
        public static void print(){
            System.out.println("Printed");
        }
    }
    public void run(){
        System.out.println(a);
        System.out.println(b);
        Static.Inner st =  new Static.Inner();
        System.out.println(st.a);
        st.run();
    }
}
