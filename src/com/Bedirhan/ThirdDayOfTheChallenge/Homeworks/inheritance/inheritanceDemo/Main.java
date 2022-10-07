package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.inheritance.inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();
        krediUI.hesapla(new OgretmenKrediManager());
        krediUI.hesapla(new TarimKrediManager());
        krediUI.hesapla(new AskerKrediManager());
    }
}
