package day18;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main (String args []) {

        System.out.println("Program is started...");


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        try {
            System.out.println(100/num);                //Arithmetic Exception if divided by zero
        }
        catch (ArithmeticException e) {
            System.out.println("Invalid Data... ");
        }

        System.out.println("Program is completed...");
        System.out.println("Program is exited...");




    }
}
