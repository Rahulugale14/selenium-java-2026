package day18;

public class FinallyBlock {

    public static void main (String args []) {

        String s = null;
        try {
            System.out.println(s.length());
        }

        catch(Exception e) {
            System.out.println("Handled exception.....");
            System.out.println(e.getMessage());
        }
        finally {                       //finally block will always execute
            System.out.println("you entered finally block.....");
        }
        
        System.out.println("Program finished.....");


    }
}
