package day4;

public class LargestOf3Numbers {

        /*
        a>b and a>c
        b>a and b>c
        c>a and c>b
         */
    public static void main (String [] args) {

        int a=1100, b=20, c=1001;

        if (a>b && a>c) {
            System.out.println(a + " is the largest number than " + b + " & " + c);
        }
        else if (b>a && b>c) {
            System.out.println(b + " is the largest number");
        }
        else {
            System.out.println(c + " is the largest number");
        }


    }


}
