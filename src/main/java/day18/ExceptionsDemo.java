package day18;

import java.util.Scanner;

public class ExceptionsDemo {

    public static void main (String args[]) {

        System.out.println("Program is started...");

        Scanner sc = new Scanner(System.in);

        //Example1 --> Arithmetic Exception
        /*
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(100/num);                                            //try doing 100/0 or 100/12.5 to check type of exceptions
        */


        //Example2 --> ArrayIndexOutOfBoundsException
        /*

        int a[] = new int[5];
        System.out.println("Enter the position(0-4): ");
        int position = sc.nextInt();
        System.out.println("Enter a value: ");
        int value = sc.nextInt();
        a[position]=value;
        System.out.println(a[position]);

        */

        //Example3 --> NumberFormatException
        /*

        String s = "12345";                     //try passing alphabets here
        int num = Integer.parseInt(s);
        System.out.println(num);

         */

        //Example4 --> NullPointerException
        String s = null;
        System.out.println(s.length());





        System.out.println("Program is completed...");
        System.out.println("Program is exited...");








    }
}
