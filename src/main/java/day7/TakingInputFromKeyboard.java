package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter the number: ");
        int num = sc.nextInt();
        System.out.println("Entered number is: " + num);

        System.out.println("Please enter the decimal number: ");
        double d = sc.nextDouble();
        System.out.println("The decimal number you have entered is: " + d);

        System.out.println("Enter your City: ");
        String s = sc.next();
        System.out.println("Your city is: " + s);





    }




}
