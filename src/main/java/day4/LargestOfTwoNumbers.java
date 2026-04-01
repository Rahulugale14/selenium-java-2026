package day4;

public class LargestOfTwoNumbers {

    public static void main (String [] args) {

        int a=10, b=20;                                 // method1 --> by if else statements
        if (a>b) {
            System.out.println(a + " is the largest");
        }
        else {
            System.out.println(b + " is the largest");
        }

        int x=30, y=40;
        int z=(x>y)? x: y;                              // method2 --> by ternary operator
        System.out.println(z);
    }

}
