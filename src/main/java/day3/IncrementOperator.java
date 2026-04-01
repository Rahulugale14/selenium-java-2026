package day3;

public class IncrementOperator {

    public static void main (String [] args) {

        //case1
       int a=10;
       System.out.println(a);
       a++;                                              // a=a+1;
       System.out.println(a);

        System.out.println("------------------------------");

       //case2
        int b=20;
        int res = b++;                          // this is called post increment
        System.out.println(res);                // it should be incremented to 21 but it's 20 due to post increment
        System.out.println(b);                  // increment is happening after assignment to "res"

        System.out.println("------------------------------");

        //case3
        int c=30;
        int res1 = ++c;                         // this is called pre increment
        System.out.println(res1);
        System.out.println(c);
        System.out.println(++c);










    }




}
