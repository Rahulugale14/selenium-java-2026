package day11JavaMethods;

public class GreetingsMain {

    public static void main (String args[]) {

        Greetings greet = new Greetings();

        greet.met1();                                           //1st method

        String str = greet.met2();                              //2nd method
        System.out.println(str);

        greet.met3("--- alright awesome");                //3rd method

        String stry = greet.met4("Devdas");               //4th method
        System.out.println(stry);



    }
}
