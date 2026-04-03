package day9;

public class StringVsStringBufferVsStringBuilder {

    public static void main (String[] args) {

        String s = "Shallow Water";
        s.concat("Sprinkled");
        System.out.println(s);              //immutable as it cannot change original value


        StringBuffer sb = new StringBuffer("Deep Sea ");
        sb.append("creatures");
        System.out.println(sb);             //mutable as it changes the original value

        StringBuilder sbb = new StringBuilder("Venomous ");
        sbb.append("snake");
        System.out.println(sbb);            //mutable as it changes the original value




    }


}
