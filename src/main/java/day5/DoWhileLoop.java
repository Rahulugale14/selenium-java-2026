package day5;

public class DoWhileLoop {

    public static void main (String [] args) {


        //example1 ---> increment
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 10);


        System.out.println("----------------------------------------------");


        //example2 ---> decrement
        int j=10;
        do {
            System.out.println(j);
            j--;
        }
        while(j>0);



    }


}
