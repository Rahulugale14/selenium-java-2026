package day7;

import java.util.Arrays;

public class SortingCharsStringArray {

    public static void main (String [] args) {

        char c [] = {'E', 'H', 'D', 'C', 'B', 'A'};
        System.out.println("Before Sorting: " + Arrays.toString(c));
        Arrays.sort(c);
        System.out.println("After Sorting: " + Arrays.toString(c));


        String s[] = {"rahul", "surabhi", "aamol", "sharu", "dheru", "peru"};
        System.out.println("Before Sorting: " + Arrays.toString(s));
        Arrays.sort(s);
        System.out.println("After Sorting " + Arrays.toString(s));


    }




}
