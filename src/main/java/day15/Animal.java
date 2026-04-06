package day15;

public class Animal {
    String color = "white";

    void eat() {
        System.out.println("dog eating");
    }
}

class Dog extends Animal {
    String color = "black";

    void displayColor() {
        System.out.println(super.color);
    }

    void eat() {
        //System.out.println("Eating Bread");
        super.eat();                            //super keyword invokes immediate parent class method
    }
}
