package day12MethodConstructorOverloading;

public class BoxMain {

    public static void main (String args[]) {

        Box bx = new Box();                                 //this is 1st Constructor i.e, default Constructor
        System.out.println(bx.volume());

        Box b =new Box(10.5, 15.5, 5.0);           //2nd Constructor
        System.out.println(b.volume());

        Box bo = new Box(10.5);                         //3rd Constructor
        System.out.println(bo.volume());



    }
}
