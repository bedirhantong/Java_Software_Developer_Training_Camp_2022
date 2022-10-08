package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.InnerClasses.Example3;

import java.util.ArrayList;

public class DahiliSinifOrnegi {



    // asal sayi hesaplama
    public class AsalSayi {
        public boolean asalSayi (int asalSayi){
            int bolen = 0;
            for (int i = 2; i <asalSayi ; i++) {
                if (asalSayi %i == 0)
                    bolen++;
            }
            return bolen == 0;
        }
    }

    // burası mukemmel sayi hesaplar

    protected class Mukemmelsayi{

        protected boolean mukemmelSayi(int mukemmelSayi){
            int bolenToplam = 0;

            for (int i = 1; i < mukemmelSayi ; i++) {
                if (mukemmelSayi %i == 0)
                    bolenToplam+= i ;
            }
            return bolenToplam == mukemmelSayi;
        }
    }

    // Fibonacci elemanlarını bulmak için ..
    private class FibonacciSerisi{
        private ArrayList fibonacciSerisi(int elemanSayisi){
            ArrayList<Integer> fibonacci = new ArrayList<>();
            fibonacci.add(0,1);
            fibonacci.add(1,1);
            for (int i = 0; i < elemanSayisi-2; i++) {
                fibonacci.add(i+2,fibonacci.get(i)+fibonacci.get(i+1));
            }
            return fibonacci;
        }
    }
    public static void main(String[] args) {
        DahiliSinifOrnegi dahiliSinifOrnegi  = new DahiliSinifOrnegi();
        DahiliSinifOrnegi.AsalSayi asalSayi =  dahiliSinifOrnegi.new AsalSayi();
        DahiliSinifOrnegi.FibonacciSerisi fibonacciSerisi = dahiliSinifOrnegi.new FibonacciSerisi();
        DahiliSinifOrnegi.Mukemmelsayi mukemmelsayi =  dahiliSinifOrnegi.new Mukemmelsayi();

        System.out.println(asalSayi.asalSayi(5));
        System.out.println(asalSayi.asalSayi(413));
        System.out.println(mukemmelsayi.mukemmelSayi(6));
        System.out.println(mukemmelsayi.mukemmelSayi(12));
        System.out.println(fibonacciSerisi.fibonacciSerisi(7));
        System.out.println(fibonacciSerisi.fibonacciSerisi(11));

    }




















}
