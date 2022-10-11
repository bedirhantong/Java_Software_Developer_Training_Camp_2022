package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.StringClassesMethods;

public class StringSinifinaGris {
    public static void main(String[] args) {
        String str = "ben";
        String n = str.toUpperCase();
        System.out.println(str);  // ben
        System.out.println(n);  // BEN

        System.out.println(str.length());

        String s = String.format("%d cmdir",4);

        str("bedirhan",31,"tl","dolar");



                         //Stringleri birleştirmek
         // + operatoru ile
        String d1 = "String";
        String d2 = "Birlestirmek";
        int d3 = 3;
        String d4 = d1+d2+d3;
        System.out.println(d4);

        System.out.println("-------------");

        System.out.println("Peki newlersek?");
        String d15 = new String("String");
        String d26 = new String("Birlestirmek");
        System.out.println(d15+d26);


         // concat ile birlestirmek
        System.out.println("anahtar".concat("naber"));


        compIgnoreCase("an","na");
        compIgnoreCase("aN","an");
        String str1 = "An";
        String str2 = "an";
        compIgnoreCase(str1,str2);




        int val = "Sezen".compareToIgnoreCase("Sezer");
        if (val>0){
            System.out.println("Sezen");
        } else if (val <0) {
            System.out.println("Sezer");
        }
        else System.out.println("Equal");

    }

    public static void str(String format,Object... args){
        System.out.println(format);
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public static void compIgnoreCase(String o , String n){
        if (o.equalsIgnoreCase(n)){
            System.out.println("esit");
        }
        else
            System.out.println("nothing");
    }
    public static void compCaseSensitive(String o , String n){
        if (o.equalsIgnoreCase(n)){
            System.out.println("esit");
        }
        else
            System.out.println("nothing");
    }






}
