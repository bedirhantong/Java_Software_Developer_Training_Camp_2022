package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.InnerClasses.Example4;

public class IslemYap {

    public class DahiliUyeSinif {
        private int x;
        private int y;

        public DahiliUyeSinif(int sayi1, int sayi2){
            x=sayi1;
            y=sayi2;
        }

        public void carp(){
            System.out.println("result : "+ (x*y));
        }
    }
    // sealed
    public static class DahiliUyeSinif2{
        public static void topla(int x, int y){
            System.out.println("result : "+ (x+y));
        }

    }

    public static void main(String[] args) {
        IslemYap islemYap =  new IslemYap();
        IslemYap.DahiliUyeSinif a = islemYap. new DahiliUyeSinif(5,8);
        a.carp();
        DahiliUyeSinif2.topla(5,2);

    }



}
