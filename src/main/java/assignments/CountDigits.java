package assignments;

public class CountDigits {

    public static void main (String [] args) {

        int num=12345, count=0;
        while (num != 0) {
            num /= 10;                      //removing last digit
            count++;                        //incrementing count

        }
        System.out.println("Number of digits: " + count);

    }
}
