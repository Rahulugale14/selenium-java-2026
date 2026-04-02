package day6;

public class ObjectArray {

    public static void main (String [] args) {


       //Object allows all types of data
       Object a[] = {100, 200, 'A', "Java", 20.50, true};

        for (Object x:a) {
            System.out.println(x);
        }

    }

}
