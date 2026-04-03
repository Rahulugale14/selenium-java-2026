package day9;

public class CountCharacterInString {

    public static void main (String [] args) {

        String str = "Automation testing";
        char target = 't';

        int count=0;

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==target) {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }
}
