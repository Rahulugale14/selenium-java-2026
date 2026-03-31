package day2;

public class DataTypesDemo {

    public static void main (String [] args) {

        //numeric data types
        int a=100, b=200;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of a is: " + b);
        System.out.println(a+b);
        System.out.println("The VALUE of a and b is: " + a+b);
        System.out.println("The Sum of a and b is: " + (a+b));

        byte by=125;
        System.out.println(by);

        short sh=3535;
        System.out.println(sh);

        long l=3535525252552L;                       //literal "L/l" is needed
        System.out.println(l);

        //DECIMAL numbers --> float, double
        float item_price=15.5F;                     //literal "F/f" is needed
        System.out.println(item_price);
        double dbl=12345.54321;
        System.out.println(dbl);

        char grade='A';
        System.out.println(grade);

        String name="Rahul";
        System.out.println(name);

        boolean bl=true;
        System.out.println(bl);
        boolean bll=false;
        System.out.println(bll);


    }






}
