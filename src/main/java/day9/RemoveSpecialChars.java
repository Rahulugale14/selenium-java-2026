package day9;

public class RemoveSpecialChars {

    public static void main (String [] args) {

        String str = "W!elcome@ to% Ja&va*, let's do so%me pro@#$*gramming ()p)ra%ctice";
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Original: " + str);
        System.out.println("Cleaned: " + cleaned);


    }
}
