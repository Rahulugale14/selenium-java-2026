package day7;

import java.util.Scanner;

public class TakingMultipleInputsFromKeyboard {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Sum of two numbers: " + (num1 + num2));

        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Your name is: " + name);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter any random value: ");
        Object value = sc.next();
        System.out.println("Random value is: " + value);


    }




}
