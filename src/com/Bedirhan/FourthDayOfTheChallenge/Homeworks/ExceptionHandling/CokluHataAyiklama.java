package com.Bedirhan.FourthDayOfTheChallenge.Homeworks.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CokluHataAyiklama {
    public static void main(String[] args) {
        char[] datas = new char[100];
        File file = new File("C:\\Users\\cengb\\Masaüstü\\nbr.txt");
        try{
            FileReader fileReader = new FileReader(file);
            fileReader.read(datas);
            String data = new String(datas);
            System.out.println(data);
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.println("hata olustu");
            System.out.println(e.toString());
//            throw new RuntimeException(e);
        }
    }
}
