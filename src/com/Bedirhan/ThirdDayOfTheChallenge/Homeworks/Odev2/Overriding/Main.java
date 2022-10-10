package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.Overriding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{
                new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()
        };

        for (BaseKrediManager krediManager : krediManagers){
            System.out.println(krediManager.calc(100));
        }

    }
}
