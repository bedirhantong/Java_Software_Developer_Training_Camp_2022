package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calc();
        womanGameCalculator.gameOver();


        BaseGameCalculator gameCalculator = new KidsGameCalculator();
        /*
        Bunun amacı sadece basegamecalculatorda oluşturduğumuz abstract metodları kullanabilmek onun dışındakine
        erişmeyi kapatmak
         */
        gameCalculator.calc();








    }
}
