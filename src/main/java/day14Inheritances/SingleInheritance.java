package day14Inheritances;

//this is a parent class
class A {

    int a=100;
    void display() {
        System.out.println(a);
    }

}

//this is a child class
class B extends A {

    int b=200;
    void show() {
        System.out.println(b);
    }
}


public class SingleInheritance {

    public static void main (String args []) {

        B bObj = new B();
        System.out.println(bObj.a);
        System.out.println(bObj.b);
        bObj.display();
        bObj.show();
    }
}
