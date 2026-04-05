package day12;

public class Adder {

    int a=10, b=20;

    //1st method
     void sum() {
         System.out.println(a+b);
     }

                /*same as 1st method
                int sum () {
                return(a+b);                           //this is return type & not used in overloading
                }
                */

     //2nd method
     void sum(int x, int y) {
         System.out.println(x+y);
     }

    //3rd method
    void sum(int x, double y) {
        System.out.println(x+y);
    }

    //4th method
    void sum(double y, int x) {
        System.out.println(x+y);
    }

    //5th method
    void sum(int x, int y, int z, String name) {
        System.out.println(x+y+z+name);
    }


}
