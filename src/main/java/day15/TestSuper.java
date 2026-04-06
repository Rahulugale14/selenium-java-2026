package day15;

public class TestSuper {

    public static void main (String args[]) {

        Dog dg = new Dog();
        dg.displayColor();            //super is used in child class "Dog" so it invokes immediate parent class variable
        dg.eat();                     //super keyword invokes immediate parent class method

    }
}
