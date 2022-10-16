package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.Odev2.StringClassesMethods;

public class StringBuffferDemo {
    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("Mehmet");
//        stringBuffer.append(" Kirazli").append(" Bursa'da ").append(1992).append(" yilinda ").append("dogmustur.");
//        System.out.println(stringBuffer);
//        stringBuffer.replace(0,6,"Kudret");
//        System.out.println(stringBuffer);
//        stringBuffer.insert(0,"Ben ve ");
//        System.out.println(stringBuffer);


        StringBuffer s = new StringBuffer("JavaBootcamp");
        s.delete(0,4);
//        System.out.println(s);
        s.reverse();
        System.out.println(s);
        System.out.println(s.capacity());
        s.trimToSize();
        System.out.println(s.capacity());
    }
}
