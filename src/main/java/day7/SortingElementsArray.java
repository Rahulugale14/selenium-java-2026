package day7;

import java.util.Arrays;

public class SortingElementsArray {

    public static void main (String [] args) {

        int a[] = {100,300,400,900,800};
        System.out.println("Before Sorting " + Arrays.toString(a));

        Arrays.sort(a);
        System.out.println("After Sorting " + Arrays.toString(a));

    }
}
