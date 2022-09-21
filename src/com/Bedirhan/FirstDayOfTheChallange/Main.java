package com.Bedirhan.FirstDayOfTheChallange;

/**
 * @author BEDİRHAN TONĞ
 * @since 21.09.2022
 */

// Yukarıdaki olaya javadoc denir.

public class Main {
    // final int perminantNum; is not gonna work when you use final outside of an
    // method u should initialize it at first, in the arbitrary I mean inside of method
    // u can initialize it in another line.

    public static void main(String[] args) {
        System.out.println("Hello World");

        int num1 = 3;
        double dNum = 3.4;
        float fNum = 3.4f;

        System.out.println(num1+" "+dNum+" "+fNum);

        // Printing UpperCase Letters
        char charachter;
        int number;
        for (int i = 65; i <= 90 ; i++) {
            number = i;
            charachter = (char) number;
            System.out.println(charachter+"-");
        }

    }
}
