package day9;

public class ReverseString {

    public static void main (String args[]) {

        //Approach1
        String s = "SpiderMan-BrandNewDay";
        String rev = "";
        for (int i=s.length()-1; i>=0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reverse String is: " + rev);


        System.out.println("----------------------------------");


        //Approach2 - by converting String to char array
        String s1 = "Amazing Spiderman";
        String rev1="";
        char c[]=s1.toCharArray();
        for (int i=c.length-1; i>=0; i--) {
            rev1 = rev1+c[i];
        }
        System.out.println("Reverse String is: " + rev1);



    }
}
