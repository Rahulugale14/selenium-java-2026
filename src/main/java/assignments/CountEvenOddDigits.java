package assignments;

public class CountEvenOddDigits {

    public static void main (String [] args) {

        int num = 123456789;
        int evenCount=0, oddCount=0;

        while (num != 0) {
            int digit = num%10;                 //extracting last digit

            if (digit %2 == 0) {
                evenCount++;                    //even digit
            }
                else
                    oddCount++;                 //odd count

            num /= 10;

        }

        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);


    }

}
