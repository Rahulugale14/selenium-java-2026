package day19;

public class TypeCastingObjects3 {

    public static void main (String args []) {

        //===> type casting expression====> A    b    =   (C)   d;

        //Rule1 ---> Conversion is valid or invalid
        //              As shown above, the type of 'd' & 'c' must have some relationship (either parent to child or vice versa)

        //Rule2 ---> Assignment is valid or invalid
        //              'c' must be either same or child of 'a'

        //Rule3 ---> The underlying object type of 'd' must be either same or child of 'c'


        //Example1:
            //Object obj1 = new String("Welcome");
            //StringBuffer sb1 = (StringBuffer) obj1;               //Rule1 & Rule2 valid, Rule3 invalid

        //Example2:
            //String st = new String("Welcome");
            //StringBuffer sb2 = (StringBuffer) st;                 //Rule1 invalid


        //Example3
            //Object obj2 = new String("Welcome");
            //StringBuffer sb3 = (String) obj2;                     //Rule1 valid, Rule2 invalid

        //Example4
            //String str1 = new String("Welcome");
            //StringBuffer sb4 = (String) str1;                     //Rule1 valid, Rule2 failed

        //Example5
        Object obj3 = new String("Welcome");
        String str2 = (String) obj3;                                //All rules are valid
        System.out.println(str2);






    }
}
