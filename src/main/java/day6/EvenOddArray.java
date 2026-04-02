package day6;

public class EvenOddArray {

    public static void main (String [] args) {

        //example 1 --> using for loop
        System.out.print("Even Numbers are: ");
        int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.print("\nOdd Numbers are: ");
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println("\n-------------------------------------");


        //example2 --> using for each loop
        int ar [] = {100,102,103,104,105,106,107,108,109,110};

        System.out.print("Even Numbers are: ");
        for (int num:ar) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
            System.out.print("\nOdd Numbers are: ");
        for (int num: ar) {
            if (num%2 != 0) {
                System.out.print((num + " "));
            }

        }


    }
}
