package day3;

public class TernaryOperator {

    public static void main (String [] args) {

        // var=exp?  result1 : result 2;

        // example1
        int a=200, b=100;
        int x = (a>b)? a: b;
        System.out.println(x);          //here as a>b, a value is compared(true/false) with a>b & is assigned to x

        int x1 = (a<b)? a: b;
        System.out.println(x1);         //here as a<b, a value is compared with a<b(true/false) & is assigned to b

        System.out.println("------------------------");


        // example2
        int x3=(1==1)? 100: 200;        // (1==1) is an expression & it's true so x3 will be 100
        System.out.println(x3);

        int x4=(1==2)? 200: 300;        // (1==2) is an expression & it's false so x4 will be 300
        System.out.println(x4);

        System.out.println("------------------------");

        // example3
        int person_age=30;                                              // make age as 15 & rerun
        String result = (person_age>=18)? "eligible": "not eligible";       //here expression is compared
        System.out.println(result);







    }


}
