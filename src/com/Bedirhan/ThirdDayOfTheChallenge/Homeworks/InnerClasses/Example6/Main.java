package com.Bedirhan.ThirdDayOfTheChallenge.Homeworks.InnerClasses.Example6;

public class Main {
    public static void main(String[] args) {
        Nonstatic n = new Nonstatic();
        Nonstatic.Inner inner =  n.new Inner();
//        inner.run();
//        n.run();
        Static st =  new Static();
//        st.run();
        Static.Inner s =  new Static.Inner();
//        s.run();
//        Static.Inner.print();

        Local l = new Local();
//        l.run();
        Anonym a = new Anonym(){
            @Override
            public void run() {
                System.out.println("Burasi anonim classtir");
            }
            public void print(){
                System.out.println("Printing broooo not overriding");
            }
        };
        a.run();
        IEdible iEdible =  new IEdible() {
            @Override
            public void eat() {
                System.out.println("Naber gülüm");
            }
        };
        iEdible.eat();
    }
}
