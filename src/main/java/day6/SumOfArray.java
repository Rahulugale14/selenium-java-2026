package day6;

public class SumOfArray {

    public static void main (String [] args) {

        //example1 --> using for loop

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum = " + sum);



        //example2 --> using for each loop

        int ar[] = {45, 65, 77, 98, 99};
        int total = 0;

        for (int num:ar) {
            total += num;
        }
        System.out.println("Sum = " + total);

    }
}

