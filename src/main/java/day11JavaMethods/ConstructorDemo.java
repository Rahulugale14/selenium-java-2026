package day11JavaMethods;

public class ConstructorDemo {

    int x,y;

    //default Constructor
    ConstructorDemo() {
        x=100;
        y=200;
    }

    //Parameterized Constructor
    ConstructorDemo(int a, int b) {
        x=a;
        y=b;
    }

    void sum() {
        System.out.println(x+y);
    }


    public static void main (String args []) {

        ConstructorDemo cd = new ConstructorDemo();         //this will invoke default Constructor
        cd.sum();

        ConstructorDemo cdm = new ConstructorDemo(105,205);// will invoke parameterized Constructor
        cdm.sum();

        }

    }

