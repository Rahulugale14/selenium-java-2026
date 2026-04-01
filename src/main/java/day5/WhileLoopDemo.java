package day5;

public class WhileLoopDemo {

    public static void main (String [] args ) {

        // example1 -> 1 to 10 numbers
        int i=1;                        //step1 -> initialization

        while (i<=10) {                 //step2 -> condition

            System.out.println(i);
            i++;                        //incrementing i
        }

        System.out.println("----------------------------------------------");


        // example2 -> print "hello" message 10 times
        int h = 1;
        while (h<=10) {
            System.out.print("hello ");
            h++;
        }

        System.out.println();
        System.out.println("----------------------------------------------");


        // example3 -> print even numbers between 1 to 50
        int x=2;
        while (x<=50) {
            System.out.print(x + " ");
            x+=2;
        }

        System.out.println();
        System.out.println("----------------------------------------------");


        // example3 -> using for loop inside while loop to print even numbers
        int y=1;
        while (y<=10) {                         //while condition is for how many times to repeat
            if (y%2==0) {                       //if is for even number condition
                System.out.println(y);
            }
            y++;
        }

        System.out.println("----------------------------------------------");


        // example4 -> specify 1 to 10 numbers as even & odd
        int s=1;
        while (s<=10) {
            if (s%2==0) {
                System.out.println(s + " even number");
            }
            else {
                System.out.println(s + " odd number");
            }
            s++;
        }

        System.out.println("----------------------------------------------");

        // example5 -> print 10 to 1 decrementing
        int r=10;
        while (r>=0) {
            System.out.println(r);
            r--;
        }





    }
}
