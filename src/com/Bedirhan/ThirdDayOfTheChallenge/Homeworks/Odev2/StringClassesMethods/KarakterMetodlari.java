package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.StringClassesMethods;

public class KarakterMetodlari {
    public static void main(String[] args) {
        String dizge = "Bu bolumde String nesnelerin metotlarını ogreniyoruz";
        char[] kaynak1 = new char[6];
        char[] kaynak2 = new char[9];
        char[] kaynak3 = new char[11];
        dizge.getChars(11,17,kaynak1,0);
        System.out.println(kaynak1);
        dizge.getChars(18,27,kaynak2,0);
        System.out.println(kaynak2);
        dizge.getChars(41,52,kaynak3,0);
        System.out.println(kaynak3);
    }
}