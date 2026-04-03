package day8;

import java.util.Arrays;

public class StringMethods {

    public static void main (String [] args) {

        String s = new String("Welcome");
        System.out.println(s);

        //Method 1 ---> Length of Strings
        int l = s.length();
        System.out.println(l);
        //or
        System.out.println(s.length());
        //or
        System.out.println("Hello Jarvis".length());

        System.out.println("-----------------------------------------");

        //Method 2 ---> Concat()S - joining strings
        String s1 = "Captain America ";
        String s2 = "Iron Man ";
        String s3 = "Hulk Smash";
        System.out.println(s1+s2);                                                                  //or
        System.out.println(s1.concat(s2));
        System.out.println(s1+s2+s3);                                                               //or
        System.out.println(s1.concat(s2 + s3));                                                 //or
        System.out.println(s1.concat(s2).concat(s3));                                               //or
        System.out.println("Captain America " + "Iron Man " + "Hulk Smash");                        //or
        System.out.println("Captain America ".concat("Iron Man ".concat("Hulk Smash")));

        System.out.println("-----------------------------------------");


        //Method 3 ---> trim() - remove spaces right & left side
        s="   THOR HAMMER   ";
        System.out.println(s);
        System.out.println("Before trimming: " + s.length());
        System.out.println(s.trim());
        System.out.println("After trimming: " + s.trim().length());

        System.out.println("-----------------------------------------");


        //Method 4 ---> charAt() - returns a character from String based on index. Index starts from zero
        s="Scarlet Witch";
        System.out.println(s.charAt(5));
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(10));

        System.out.println("-----------------------------------------");

        //Method 5 ---> contains() method. Always return boolean value i.e, true or false
        s="Avengers Assemble";
        System.out.println(s.contains("End"));
        System.out.println(s.contains("ers"));
        System.out.println(s.contains("ASS"));
        System.out.println(s.contains("Avener"));

        System.out.println("-----------------------------------------");

        //Method 6 --> equals() & equalsIgnoreCase() - compare strings
        s1="Thanos Returns";
        s2="Thanos is killed by Thor";
        s3="Thanos Returns";
        System.out.println(s1!=s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals("Thanos Returns"));
        System.out.println(s1.equals("thanos returns"));
        System.out.println(s1.equalsIgnoreCase("thanos returns"));

        System.out.println("-----------------------------------------");

        //Method 7 ---> replace() - replace single or multiple sequence of characters in a String
        s="Wakanda Forever Black Panther from Wakanda";
        System.out.println(s.replace('W', 'X'));                     //replacing chars
        System.out.println(s.replace('a', 'Z'));
        s="Wakanda Forever Black Panther from Wakanda";
        System.out.println(s.replace("Wakanda", "India"));          //replacing String

        System.out.println("-----------------------------------------");

        //Method 8 ---> substring() - extract substring from main string
        s="AvengersDoomsday";
        System.out.println(s.substring(1,5));
        System.out.println(s.substring(0,14));
        System.out.println(s.replace('e', 'X').replace('o', 'Y'));

        System.out.println("-----------------------------------------");

        //Method 9 ---> toUpperCase() toLowerCase()
        s="Avengers SecretWars";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println("-----------------------------------------");

        //Method 10 ---> split() - spits String into multiple parts based on delimeter
        s="rahul.amol.710@gmail.com";
        System.out.println("Before Splitting: " + s);
        String a[]=s.split("@");
        System.out.println(a[0]);         //here a[0] & a[1] bcoz there will be two part after splitting so two indexes
        System.out.println(a[1]);
        System.out.println("After Splitting: " + Arrays.toString(a));

        System.out.println("-----------------------------------------");

        //example1:
        String amount = "$50,100,200";
        System.out.println(amount.replace("$",""));
        System.out.println(amount.replace("$","").replace(",",""));

        System.out.println("-----------------------------------------");

        //example2:
        s="abc,123@xyz";
        String aa[]=s.split(",");
        String ab[]=s.split("@");
        System.out.println(aa[0]);
        System.out.println(s.substring(4,7));
        System.out.println(ab[1]);
        System.out.println(aa[0] + " " + s.substring(4,7) + " " + ab[1]);

        System.out.println("-----------------------------------------");

        //example3
        s="abc 123 xyz";
        String ar[] = s.split(" ");
        System.out.println(Arrays.toString(ar));

        System.out.println("-----------------------------------------");

        //example4
        String name = "Thor Ragnarok";
        System.out.println(name.replace('T','t').contains("thor"));


    }

}
