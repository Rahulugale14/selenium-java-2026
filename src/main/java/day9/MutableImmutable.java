package day9;

import java.util.Arrays;

public class MutableImmutable {

    public static void main (String [] args ){

        //mutable
        int a[] = {10,30,90,70,20,60,40,50,80};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));         //array values are changed hence mutable

        //immutable
        String s = new String("Welcome ");
        System.out.println(s);
        s.concat("to Java");
        System.out.println(s);                          //immutable as result is not
        String concatString = s.concat("to Java");
        System.out.println(concatString);               //still output is not changed like above example arrays were changed






    }
}
