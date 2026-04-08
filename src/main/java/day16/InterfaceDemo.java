package day16;

interface Shape {
    int length=10;              //by default in interface these two are final & static variables
    int width=20;

    void circle();                                  //this is an abstract method as there's no implementation {}
    default void square() {                         // this is default method
        System.out.println("this is a square");
    }
    static void rectangle() {                       // this is a static method
        System.out.println("this is rectangle - static method");
    }

}


public class InterfaceDemo implements Shape {


    // below method in interface are always public, this method is from above interface which is implemented here
    public void circle() {
        System.out.println("This is circle - abstract method");

    }
    void triangle() {
        System.out.println("This is a triangle");
    }

    int x=100, y=200;

    public static void main(String args[]) {

        //Scenario1----------------->
        InterfaceDemo idObj = new InterfaceDemo();
        idObj.circle();                                 //calling abstract method
        idObj.square();                                 //calling default method
        //calling below rectangle method which is static method, can directly access from Interface Shape
        Shape.rectangle();
        idObj.triangle();                   //method called as it's in the class
        System.out.println(idObj.x+idObj.y);

        System.out.println("---------------------");

        //Scenario2---------------->
        //here instead of interface name, we take Classname as variable of interface holds object of class
        //We cannot create object of interface "Shape"
        Shape sh = new InterfaceDemo();
        sh.circle();                                    //calling abstract method
        sh.square();                                    //calling default method
        Shape.rectangle();                              //Static method can directly access from interface
        //sh.triangle();                  //this is invaid, we are trying to access method from interface variable but this method s in th class

        System.out.println(Shape.length * Shape.width);           //accessing static variable directly using interface
        //System.out.println(sh.x+sh.y);                        // we cannot access it as it's from Class


    }

}

