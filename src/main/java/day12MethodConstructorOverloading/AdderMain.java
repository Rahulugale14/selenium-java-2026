package day12;

public class AdderMain {

    public static void main (String args[]) {

        Adder ad = new Adder();
        ad.sum();                               //1st method
        ad.sum(200, 300);                 //2nd method
        ad.sum(500, 70.7);                //3rd method
        ad.sum(20.25, 900);               //4th method
        ad.sum(11,22,33, "Rahul");              //5th method


    }


}
