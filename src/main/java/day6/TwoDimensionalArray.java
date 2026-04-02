package day6;

public class TwoDimensionalArray {

        /*
    1) Declare an array             arrays always start from zer i.e. index always start from zero
    2) Add values into array
    3) Find size of an array
    4) Read single value from array
    5) Read multiple values from an array
     */


    public static void main (String [] args) {

        // DECLARING ARRAY

        //  Approach 1
        int a[][] = new int[3][2];
        a[0][0] = 100;
        a[0][1] = 200;
        a[1][0] = 300;
        a[1][1] = 400;
        a[2][0] = 500;
        a[2][1] = 600;
        System.out.println("Length of rows: " + a.length);

        // Approach 2
        int b[][] = {
                    {100,200},
                    {300,400},
                    {500,600},
                    {700,800}
            };

        // Find size of an Array
        System.out.println("Length of rows: " + b.length);
        System.out.println("Length of columns: " + b[0].length);

        // Read Single value from an array
        System.out.println(b[2][1]);            //600

        System.out.println("-------------------------");


        // Read all the rows & all the columns from multidimensional array
            //1. By using normal for loop

        for (int r=0; r<=b.length-1; r++) {
            for (int c=0; c<=b[r].length-1; c++) {
                System.out.print(b[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

            //2. By enhance for loop

        for (int arr[]:b) {
            for (int x:arr) {
                System.out.print(x + " ");
            }
        }

        System.out.println();



    }
}
