package day9;

public class StringComparison {

    public static void main(String[] args) {

        //case1
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        System.out.println("-------------------");

        //case2
        String s3 = new String ("Python");
        String s4 = new String ("Python");
        System.out.println(s3==s4);                 // == used to compare the objects
        System.out.println(s3.equals(s4));          // equals used to compare values of objects

        System.out.println("-------------------");


        //case3
        String s5 = "Zombie";
        String s6 = new String("Zombie");
        System.out.println(s5==s6);
        System.out.println(s5.equals(s6));

        System.out.println("-------------------");

        //case4
        String s7 = "Planet of Apes";
        String s8 = new String("Planet of Apes");
        String s9=s8;
        System.out.println(s7==s8);
        System.out.println(s7.equals(s8));
        System.out.println(s8==s9);
        System.out.println(s8.equals(s9));
        System.out.println(s7==s9);
        System.out.println(s7.equals(s9));


    }


}
