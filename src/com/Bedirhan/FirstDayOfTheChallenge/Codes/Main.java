package com.Bedirhan.FirstDayOfTheChallenge.Codes;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        System.out.println("Hello Word");

        //değişken isimleri java'da camelCase yazılır
        String ortaMetin="İlginizi Çekebilir";
        String altMetin="Vade Süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);


        int vade=12;
        double dolarDun=18.20;
        double dolarBugun=18.20;
        boolean dolarDustuMu=true;

        String okYonu="";

        //Şart blokları
        if(dolarBugun<dolarDun) {//true
            okYonu="down.svg";
            System.out.println(okYonu);

        }
        else if(dolarBugun>dolarDun) {
            okYonu="up.svg";
            System.out.println(okYonu);
        }

        else {

            okYonu="equal.svg";
            System.out.println(okYonu);
        }


        String[] krediler= {"Hızı Kredi","Maaşını Halbanktan Alanlar","Mutlu Emekli"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
//        System.out.println("Hello World");
        /*
        Primitive değişken tipleri stack
        Referans değişken tipleri Heapte tutulur
         */
//        int num1 = 3;
//        double dNum = 3.4;
//        float fNum = 3.4f;
//
//        System.out.println(num1+" "+dNum+" "+fNum);
//        System.out.println("--------------------");
//        System.out.println();

        // Printing UpperCase Letters
//        char charachter;
//        int number;
//        for (int i = 65; i <= 90 ; i++) {
//            number = i;
//            charachter = (char) number;
//            System.out.println(charachter+"-");
//        }
//        System.out.println("--------------------");
//        System.out.println("Some interesting charachters");
//        System.out.println("\rJava\'camp\"2022\\");
//        System.out.println("--------------------");
//        System.out.println();

        /*
        var ile değişken tanımlarsan ilk değer atamak zorundasın ve başka
        satırda yeni bir değer atayamazsın.
         */
//        var num = 12.32;
//        System.out.println(num);
//        System.out.println("--------------------");
//        System.out.println();

        // VERİ TİPLERİNİN BİRBİRİNE DÖNÜŞÜMÜ
        /*
        Bİr değişkeni kendinden daha büyük bir veri tipine cast edersek veri kaybı olmaz
        ama daha alt bir veri tipine cast edersek veri kaybı oluşur. Bunu bir valizdeki eşyaları
        başka valize koymak gibi düşünebilirsin.
         */
//        String val = "2";
//        int val2 = Integer.parseInt(val)*2;
//        System.out.println(val2*2);
//        String newVal = Integer.toString(val2);
//        System.out.println(newVal+newVal);
//        double dNum2 = 3.32;
//        int intNum = (int) dNum2;
//        System.out.println(intNum);

        /*
                REFERANS VERİ TİPLERİ
        Array,Class ve interface 3 referans tipidir.
        Referans veri tiplerinde işlemler değişkenin kendisi ile yapılır. Primitive tiplerde işlemler değişkenin
        kopyası ile yapılır. Bu sayede yapılan işlem sonucu değişkenimizin değeri değişir.
         */


        // KULLANICIDAN VERİ ALMA
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        System.out.println(a);
//        double d = scanner.nextDouble();
//        System.out.println(d);
//        float f = scanner.nextFloat();
//        System.out.println(f);
//        System.out.println();
//        String string = scanner.nextLine();
//        System.out.println(string);


//        String sayi = JOptionPane.showInputDialog("Bir sayi girin: ");
//        JOptionPane.showMessageDialog(null,"Yazdığınız sayi :  "+sayi);
//        JOptionPane.showMessageDialog(null,"Yazdığınız sayi :  "+sayi,"Sonuç",JOptionPane.INFORMATION_MESSAGE);


//        guessNumber();
//        String num1 = JOptionPane.showInputDialog(null,"Bir sayi gir len");
//        int a = Integer.parseInt(num1);
//        String num2 = JOptionPane.showInputDialog(null,"Bir sayi daha gir: ");
//        int b = Integer.parseInt(num2);
//        JOptionPane.showMessageDialog(null,hesapla(a,b),"SONUÇ",JOptionPane.INFORMATION_MESSAGE);

//        int a = 5;
//        switch (a){
//            case 3 :
//                System.out.println("3");
//                break;
//            case 5 :
//                System.out.println("5");
//                break;
//            default:
//                System.out.println("no");
//            break;
//        }

        /*
        int,short,byte,char,String tipindeki değişkenler switch ile kontrol edilebilir.
         */


        /*
        Overloading : Aynı isime sahip metodların farklı parametre türleri veya parametre sayısı veya parametre sırası
        veyaadönüş tipi dolayısıyla birbirinden farklı işlevlere sahip olmasıdır.
         */















// END OF MAİN METHOD
    }
    // We see the goods of static methods
    /*
    static metod oluşturunca illa her nesne için ayrı ayrı bu metodu oluşturmanıza gerek kalmaz
    hem de sınıf adıyla erişebilirsiniz
     */
    static int fak(int num){
        if ( num == 1){
            return 1;
        }
        else
            return num*(fak(num-1));
    }
    static int fibonacci (int num){
        if(num == 1){
            return 1;
        }
        else return num*fibonacci(num-1);
    }
    static void guessNumber(){
        int i = 1;
        Random r = new Random();
        int sayi = r.nextInt(10);
        while (true){
            String tahmin = JOptionPane.showInputDialog("tahmin et bakam: ");
            int t = Integer.parseInt(tahmin);
            if (t == sayi){
                String message = "Helal len yusufi "+i+". tahminde bildin";
                JOptionPane.showMessageDialog(null,message);
                break;
            }
            else {
                i++;
            }
        }
    }

}
