package day9;

public class CountWordsInString {

    public static void main(String[] args) {
        String str = "I am learning Java automation";

        String[] words = str.trim().split("\\s+");
        int count = words.length;

        System.out.println("Word count: " + count);

    }

}
