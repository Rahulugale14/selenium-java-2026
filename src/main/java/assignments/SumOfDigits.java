package assignments;

public class SumOfDigits {

    public static void main (String [] args) {

        int num=12345, sum=0;

        while (num!=0) {
            sum += num%10;                                  // adding last digit to sum
            num /= 10;                                      // removing last digit
        }
        System.out.println("Sum of digits: " + sum);

    }
}
