package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.AbstractClasses;

public abstract class BaseGameCalculator {
    public abstract void calc();
    public final void gameOver(){
        System.out.println("The Game Is Over");
    }
}
