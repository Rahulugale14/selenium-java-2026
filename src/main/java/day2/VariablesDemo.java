package day2;

public class VariablesDemo {

    public static void main (String [] args) {

        // int a;              // declaration
        // a=100;              // assignment

       /*  int a = 100;            // declaration + assignment
        System.out.println(a);
        System.out.println("a");

        a = 200;                //already datatype for "a" is mentioned above. We can always change variables values
        System.out.println(a);

        //Approach 1         --> if all variables belong to different data types
        /*int a = 100;
        int b = 200;
        int c = 300;
         */

        //Approach 2        --> if all variables belong to same data type
        /* int a,b,c;
        a=122;
        b=200;
        c=300;
         */

        //Approach 2         --> if all variables belong to same data type
        int a=100, b=200, c=300;

        System.out.print("The total of a+b+c is: ");
        System.out.println(a+b+c);

        System.out.println("----------------------");

        System.out.println("The value of a is: "+a);
        System.out.println("The value of a is: "+b);
        System.out.println("The value of a is: "+c);

        System.out.println("----------------------");

        System.out.println(a+" "+ b+" "+c);



    }
}
