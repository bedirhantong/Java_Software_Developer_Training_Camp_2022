package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.StringClassesMethods;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String sentence = "Biz-bir-gunde-mi-para-sevdalisi-olduk";
        StringTokenizer stringTokenizer = new StringTokenizer(sentence,"-");
        System.out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextElement());
        }
    }
}
