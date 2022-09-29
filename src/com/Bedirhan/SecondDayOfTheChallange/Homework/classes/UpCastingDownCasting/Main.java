package com.Bedirhan.SecondDayOfTheChallange.Homework.classes.UpCastingDownCasting;

public class Main {
    public static void main(String[] args) {
        Person person = new Asian(); // upcasting
        Asian asian = (Asian) new Person(); // downcasting
        person = asian; // upcasting
        asian = (Asian) person; //  downcasting
    }
}
class Person{
    int age;

}
class Asian extends Person{

}
