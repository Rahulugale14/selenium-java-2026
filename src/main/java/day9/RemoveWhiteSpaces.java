package day9;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String str     = "  hello world  java  ";

        // Remove ALL spaces (including middle)
        String cleaned = str.replaceAll(" ", "");

        System.out.println("Original : '" + str     + "'");
        System.out.println("Cleaned  : '" + cleaned + "'");
    }
}
