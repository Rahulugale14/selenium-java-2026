package day6;

public class SingleDimensionalArray {

    /*
    1) Declare an array             arrays always start from zer i.e. index always start from zero
    2) Add values into array
    3) Find size of an array
    4) Read single value from array
    5) Read multiple values from an array
     */

        public static void main (String [] args) {

            // DECLARING ARRAY

            // 1st Approach
            int a[]=new int[5];
            a[0]=100;
            a[1]=200;
            a[2]=300;
            a[3]=400;
            a[4]=500;
            System.out.println("Length of an array: " + a.length);

            System.out.println("----------------------------------------");


            // 2nd Approach                 assigning in one single line
            int b [] = {100,200,300,400,500,600,700,800,900,1000};
            // Find length of an array
            System.out.println("Length of an array: " + b.length);
            System.out.println("----------------------------------------");
            //read single value from an array
            System.out.println(b[5]);
            System.out.println("----------------------------------------");


            // Reading all the values from Array
                //1. By Normal for loop
            for (int i=0; i<b.length; i++) {                    // it can be i<=b.length-1
                System.out.println(b[i]);
            }

            System.out.println("----------------------------------------");

                //2. By enhanced for each loop
            for (int x:b) {
                System.out.println(x);
            }











        }

}
