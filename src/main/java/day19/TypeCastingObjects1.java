package day19;

class Parent {
    String name = "Rahul";
    void method1() {
        System.out.println("This is method1 from Parent class");
    }
}

class Child extends Parent {
    int id = 101;
    void method2() {
        System.out.println("This is method2 from Child");
    }
}
public class TypeCastingObjects1 {

    public static void main (String args []) {

        Child ch1 = new Child();                //normal flow
        System.out.println(ch1.name);
        ch1.method1();
        System.out.println(ch1.id);
        ch1.method2();

        Parent pr1 = new Child();                //this is called upcasting as Child is lower than Parent.
        System.out.println(pr1.name);
        pr1.method1();
        //System.out.println(pr1.id);            //cannot access these two as only parent stuff is accepted
        //pr1.method2();

        Parent pr2 = new Parent();
        Child ch2 = (Child)pr2;                 //downcasting --> storing higher to lower
        System.out.println(ch2.name);           //we can access everything (methods & variables from Child & Parent classes
        System.out.println(ch2.id);
        ch2.method1();
        ch2.method2();


    }

}
