package day5;

public class ContinueStatement {

    public static void main (String [] args) {

        //example 1
        for (int i=1; i<=10; i++) {
            if (i==5) {
                continue;
            }
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println("------------------");


        //example 2
        for (int j=1; j<=10; j++) {
            if (j==3 || j==5 || j==9) {
                continue;
            }
            System.out.print(j + " ");
        }


    }
}
