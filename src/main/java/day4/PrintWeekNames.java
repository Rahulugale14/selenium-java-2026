package day4;

public class PrintWeekNames {

    public static void main (String [] args) {

        // example --> display week names based on week numbers

        int weekNum=5;

        if (weekNum==1) {
            System.out.println("Sunday");
        }
        else if (weekNum==2) {
            System.out.println("Monday");
        }
        else if (weekNum==3) {
            System.out.println("Tuesday");
        }
        else if (weekNum==4) {
            System.out.println("Wednesday");
        }
        else if (weekNum==5) {
            System.out.println("Thursday");
        }
        else if (weekNum==6) {
            System.out.println("Friday");
        }
        else if (weekNum==7) {
            System.out.println("Saturday");
        }

        else {
            System.out.println("Invalid Number");
        }


            // as there are a lot of statements, use Switch case


    }

}
