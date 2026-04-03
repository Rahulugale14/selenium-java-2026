package day9;

public class StringPalindrome {
    public static void main (String []args) {

        String str = "MADAM";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is Palindrome");
        }

        else {
            System.out.println(str + " is not Palindrome");
        }

    }
}
