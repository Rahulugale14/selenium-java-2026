package day5;

public class ForLoop {

    public static void main (String [] args) {

        //example1 --> write 1 to 10 numbers
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------" );

        //example2 --> print even numbers from 1 to 10
        for (int j=2; j<=10; j+=2) {
            System.out.println(j);
        }

        System.out.println("---------------------");

        //example3 --> print 1 to 10 with label even & odd
        for (int k=1; k<=10; k++) {
            if (k%2==0) {                               //we can use conditional statements inside for loops
                System.out.println(k + " even");
            }
            else {
                System.out.println(k + " odd");
            }
        }

        System.out.println("---------------------");

        //example4 --> print from 10 to 1 even & odd numbers
        for (int l=10; l>0; l--) {
            if (l%2==0) {
                System.out.println(l+ " even");
            }
            else {
                System.out.println(l + " odd");
            }
        }


    }

}
