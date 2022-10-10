package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.InnerClasses.Example1;

public class IslemYap {
    public class InnerClass{
        public void yaz(){
            System.out.println("Here is InnerClass");
        }
        public void multiplication(int a , int b){
            System.out.println(a*b);
        }
    }

    public static void main(String[] args) {
        IslemYap.InnerClass innerClass =  new IslemYap().new InnerClass();
        innerClass.multiplication(3,4);
        innerClass.yaz();
    }
}
