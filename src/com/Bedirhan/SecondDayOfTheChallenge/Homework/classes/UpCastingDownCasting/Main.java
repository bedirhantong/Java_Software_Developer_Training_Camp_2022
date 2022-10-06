package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.UpCastingDownCasting;

public class Main {
    public static void main(String[] args) {
//        Person person = new Asian(); // upcasting
//        Asian asian = (Asian) new Person(); // downcasting
//        person = asian; // upcasting
//        asian = (Asian) person; //  downcasting


    }
}
class Person{
    int age;

    public void print(){
        System.out.println("HUman");
    }

}
class Asian extends Person{
    public void yaz(){
        System.out.println("ım asian");
    }
}
