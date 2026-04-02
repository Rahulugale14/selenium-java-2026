package assignments;

public class MissingNumberInArray {

    public static void main (String []args ) {


        int[] a = {1, 3, 4, 5};
        int n = a.length + 1;                                               // Total numbers should be 5 (1 to 5)

        // Sum formula: n*(n+1)/2
        int expectedSum = n * (n + 1) / 2;                                  // 1+2+3+4+5 = 15
        int actualSum = 0;

        for (int num : a)
            actualSum += num;                                               // 1+3+4+5 = 13

        int missing = expectedSum - actualSum;                              // 15 - 13 = 2

        System.out.println("Expected Sum : " + expectedSum);                // 15
        System.out.println("Actual Sum   : " + actualSum);                  // 13
        System.out.println("Missing Number: " + missing);                   // 2


    }

}
