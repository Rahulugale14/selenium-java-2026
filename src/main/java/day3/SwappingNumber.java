package day3;

public class SwappingNumber {

    public static void main (String [] args) {

        // method1 --> using temporary variable temp
        int a=5, b=10;
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a=" + a + " b=" + b);


        //method2 --> using multiplication & division
        int x=5, y=10;
        x = x*y;        //50
        y = x/y;        //5
        x = x/y;        //10
        System.out.println("x=" + x + " y=" + y);









    }




}
