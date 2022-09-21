package com.Bedirhan.FirstDayOfTheChallange;

/**
 * @author BEDİRHAN TONĞ
 * @since 21.09.2022
 * {System.out.println("Hello World");}
 */

// Yukarıdaki olaya javadoc denir.

public class Main {
    // final int perminantNum; is not gonna work when you use final outside of an
    // method u should initialize it at first, in the arbitrary I mean inside of method
    // u can initialize it in another line.

    public static void main(String[] args) {
        System.out.println("Hello World");
        /*
        Primitive değişken tipleri stack
        Referans değişken tipleri Heapte tutulur
         */
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

        System.out.println("Some interesting charachters");
        System.out.println("\rJava\'camp\"2022\\");

        /*
        var ile değişken tanımlarsan ilk değer atamak zorundasın ve başka
        satırda yeni bir değer atayamazsın.
         */
        var num = 12.32;
        System.out.println(num);

    }
}
