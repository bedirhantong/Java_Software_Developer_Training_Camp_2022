package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.StringClassesMethods;

public class ComparisonCont {
    public static void main(String[] args) {
        String d1 = "Ankara Turkiye'nin Baskentidir.";
        String d2 = "Turkiye";
        boolean b;
        b = d1.regionMatches(7,d2,0,d2.length());
        if (b){
            System.out.println("Icinde "+d2+" geciyor");
        }
        else
            System.out.println("Gecmiyor");

        String a1 = "JAVA PROGRAMLAMA";
        boolean basla;
        basla = a1.startsWith("JAVA");
        System.out.println(basla);
        boolean bit = a1.endsWith("PROGRAMMING");


        System.out.println(bit);
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)
    }
}
