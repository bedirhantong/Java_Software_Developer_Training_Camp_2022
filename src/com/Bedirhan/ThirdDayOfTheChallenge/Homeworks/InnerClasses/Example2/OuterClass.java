package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.InnerClasses.Example2;

public class OuterClass {
    private String name = "Java";

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.innerNesneOlustur();
    }

    public void innerNesneOlustur(){
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    public class InnerClass{
        public void print(){
            System.out.println("Here is " + name);
        }
    }
}
