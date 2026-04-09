package day18;

public class MultipleCatchBlocks {

    public static void main (String args []) {

        System.out.println("Program is started...");

        String s = null;
         try {
             System.out.println(s.length());
         }

         //method1 ---> multiple catch blocks to handle one exception
         /*
         catch(ArithmeticException e) {
             System.out.println("Handled exception.....");
             System.out.println(e.getMessage());
         }
         catch(NullPointerException e) {
             System.out.println("Handled exception.....");
             System.out.println(e.getMessage());
        }
         catch(NumberFormatException e) {
             System.out.println("Handled exception.....");
             System.out.println(e.getMessage());
        }

          */

         //method2 --> only one catch block to handle all other exceptions
         catch(Exception e) {
             System.out.println("Handled exception.....");
             System.out.println(e.getMessage());
         }
         finally {

        }

        System.out.println("Program finished.....");




    }

}


