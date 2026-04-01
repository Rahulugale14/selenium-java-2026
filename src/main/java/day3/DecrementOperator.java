package day3;

public class DecrementOperator {

    public static void main (String [] args) {

        //case1
        int a=100;
        System.out.println(a);
        a--;                                              // a=a-1;
        System.out.println(a);

        System.out.println("------------------------------");

        //case2
        int b=200;
        int res = b--;                          // this is called post decrement
        System.out.println(res);                // 200
        System.out.println(b);                  // 199
        System.out.println(b--);                // 199
        System.out.println(b--);                // 199

        System.out.println("------------------------------");

        //case3
        int c=300;
        int res1 = --c;                          // this is called post decrement
        System.out.println(res1);                // 299
        System.out.println(c);                   // 299
        System.out.println(--c);                 // 298
        System.out.println(--c);                 // 297







    }

}
