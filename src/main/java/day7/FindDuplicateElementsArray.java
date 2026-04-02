package day7;

public class FindDuplicateElementsArray {

    public static void main (String [] args) {

        int a[] = {100,200,500,100,100,600,300,400,100,200,300,500,800,900};
        int num = 300;
        int count = 0;

        for (int value:a) {
            if (value==num) {
                count++;
            }
        }
        System.out.print(count);

    }

}
