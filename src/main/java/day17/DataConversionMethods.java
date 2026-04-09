package day17;

public class DataConversionMethods {

    public static void main (String args []) {

        String s1 = "14";
        String s2 = "11";
        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

        String s3 = "14.05";
        String s4 = "11.03";
        System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));

        String s5 = "true";                 //other than true, if we pass anything, it will return false
        System.out.println(Boolean.parseBoolean(s5));


        System.out.println("----------------------------");


        //int, double, boolean, char ---> String

        int a=10;
        double d=14.05;
        char c='A';
        boolean b=true;

        String s=String.valueOf(a);
        System.out.println(s);

        s=String.valueOf(d);
        System.out.println(s);

        s=String.valueOf(c);
        System.out.println(s);

        s=String.valueOf(b);
        System.out.println(s);


    }
}
