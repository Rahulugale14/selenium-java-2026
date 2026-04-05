package day13;

import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.StringSetMatcher;

public class StaticKeyword {

    static int a=10;            //this is a static variable
    int b=20;                   //this is a non-static variable

    static void main1 () {                          //static method
        System.out.println("This is a static method");
    }

    void main2() {                                  //non-static method
        System.out.println("This is a non-static method");
    }

    void main3 () {
        System.out.println(a);
        System.out.println(b);
        main1();
        main2();
    }

    public static void main (String [] args) {

        System.out.println(a);              //static variable
        main1();                            //static method accessed without creating objects

        StaticKeyword st = new StaticKeyword();
        st.main2();                         //non-static method requires obj to run


        System.out.println("----------------------------------");


        System.out.println(st.b);           //static methods can access non-static stuff through object
        st.main2();


        System.out.println("----------------------------------");


        st.main3();                     //below non-static method access everything directly


    }
}

        /*
        if there's another class created for main method then as shown below main method
        looks like


        public static void main (String [] args {
        System.out.println(StaticKeywod.a);                     //Classname is required for variables & methods
        StaticKeyword.main3();
        }


         */
