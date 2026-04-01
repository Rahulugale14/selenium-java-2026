package day3;

public class OperatorsDemo {

    public static void main (String [] args) {

        //1) Arithmetic operators           +   -   *   /   %
        int a=20, b=10;
        int result=a+b;
        System.out.println("Sum of a and b is: "+result);
        System.out.println("Sum of a and b is: "+(a+b));
        System.out.println("Diff of a and b is: "+(a-b));
        System.out.println("Multiplication of a and b is: "+(a*b));
        System.out.println("Division of a and b is: "+(a/b));
        System.out.println("Modulo division of a and b is: "+(a%b));

        System.out.println("------------------------------------");


        //2) Relational/comparison operators            >   >=   <   <=   !=   ==
            // returns boolean value - true/false
        System.out.println(a>b);                //true
        System.out.println(a<b);                //false
        System.out.println(a>=b);               //true
        System.out.println(a<=b);               //false
        b=20;                                   //making b=a
        System.out.println(a<=b);               //true
        System.out.println(a>=b);               //true
        System.out.println(a!=b);               //false as a=b same value now
        System.out.println(a==b);               //true

        boolean res=a>b;                        //as a>b will be true/false so boolean data type to be used
        System.out.println(res);

        System.out.println("------------------------------------");

        //3) Logical operators              &&    ||      !
            // returns boolean value - true/false
            // works between two boolean values
        boolean x=true;
        boolean y=false;
        System.out.println(x&&y);                   //false
        System.out.println(x||y);                   //true
        System.out.println(!x);                     //false
        System.out.println(!y);                     //true
        boolean b1=10>20;
        System.out.println(b1);                     //false as 10 is not greater than 20
        boolean b2=20>10;
        System.out.println(b2);                     //true as 10 is lesser than 20
        System.out.println(b1&&b2);                 //false as b1 is false & b2 is true
        System.out.println(b1||b2);                 //true as b1 or b2 is false or true
        System.out.println((10<20) && (20>10));     //true


















    }


}
