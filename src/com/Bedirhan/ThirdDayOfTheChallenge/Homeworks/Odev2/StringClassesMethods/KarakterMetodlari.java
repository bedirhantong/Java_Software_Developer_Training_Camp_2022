package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.StringClassesMethods;

import java.util.Locale;

public class KarakterMetodlari {
    public static void main(String[] args) {
        String dizge = "Bu bolumde String nesnelerin metotlarını ogreniyoruz";
        char[] kaynak1 = new char[6];
        char[] kaynak2 = new char[9];
        char[] kaynak3 = new char[11];
        dizge.getChars(11,17,kaynak1,0);
//        System.out.println(kaynak1);
//        dizge.getChars(18,27,kaynak2,0);
//        System.out.println(kaynak2);
//        dizge.getChars(41,52,kaynak3,0);
//        System.out.println(kaynak3);





        String str  = "abcdefghıjklmnoprstuvyz";
//        System.out.println(str.charAt(2));

        int uzunluk = str.length();
        char[] arr =  new char[uzunluk];
        arr = str.toCharArray();

//        System.out.println(str.indexOf("yz"));
//        System.out.println(str.lastIndexOf("a"));
//        System.out.println(str.indexOf("ıjk"));
//        System.out.println(str.indexOf("ş"));
//        System.out.println(str.indexOf("a",12));
        String str1  = "abcdefghıjklmnoprstuvyz";
        String chosenPart = str1.substring(1,4);
//        System.out.println(chosenPart);
//        System.out.println(str1.substring(18));



        String str3 = "C++ Programming";

        // all occurrences of "C++" is replaced with "Java"
//        System.out.println(str3.replace("C++", "Java"));  // Java Programming


        // all occurences of "aa" is replaced with "zz"
//        System.out.println("aa bb aa zz".replace("aa", "zz")); // zz bb zz zz

        // substring not in the string
//        System.out.println("Java".replace("C++", "C")); // Java

//        System.out.println(str3.replaceAll("r","m"));

        String name = " ben sen ve biz ";
//        System.out.println(name.trim());
        // başındaki ve sonundaki boşluklar silindi ama string immutable sadece string döndürdük

        String[] arr2 = name.split("\\s");
//        for (String val:arr2) {
//            System.out.print(val);
//        }

        String toCase = "Merhaba string";
        String tr = toCase.toUpperCase();
//        System.out.println(tr);
        String en = tr.toLowerCase();
//        System.out.println(en);



    }
}
