package com.Bedirhan.FourthDayOfTheChallenge.Homeworks.ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        int a =19;
//        int b = 0;
//        int c;
//        try{
//            c = a/b;
//        }
//        catch (ArithmeticException e){  // exception türü
//            System.out.println("hata: "+e.toString());
//        }
//        System.out.println("devam ediyor mu?");




//        Scanner scanner = new Scanner(System.in);
//        int vize;
//        System.out.println("Vize notunu gir : ");
//        try {
//            vize = scanner.nextInt();
//        }
//        catch (Exception e){
//            System.out.println("hata olustu");
//            System.out.println(e);
//        }

        FileOutputStream fileOutputStream = new FileOutputStream("kitap.txt");
        try (fileOutputStream){
            String d = "metin ekliyoruz";
            byte bytes[] = d.getBytes();
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }


}
