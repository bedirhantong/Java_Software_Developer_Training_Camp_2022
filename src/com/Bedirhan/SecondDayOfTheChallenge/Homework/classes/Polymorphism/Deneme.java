package com.Bedirhan.SecondDayOfTheChallenge.Homework.classes.Polymorphism;

public class Deneme {
    public static void main(String[] args) {
        Canli c = new Canli();
        Bitki bitki = new Bitki();
        Insan insan = new Insan();
//        c.nefes();
//        nesneAl(c);
//        System.out.println();
//        nesneAl(bitki);
//        nesneAl(insan);

        System.out.println(bitki.getClass().getSimpleName());
    }
    public static void nesneAl(Canli canli){
        canli.nefes();
    }
}

class Canli{
    public void nefes(){
        System.out.println("canli");
    }
}
class Bitki extends Canli{
    public void nefes(){
        System.out.println("bitki");
    }
}
class Insan extends Canli{
    public void nefes(){
        System.out.println("Insan");
    }
}
