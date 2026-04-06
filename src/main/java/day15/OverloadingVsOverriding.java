package day15;

class ABC {
    void method1(int a) {
        System.out.println(a);
    }
    void method2(int b) {
        System.out.println(b);
    }
}


class XYZ extends ABC {

    //method overriding --- not changing declaration, but changing implementation --- achieved only with Inheritance
    void method1(int a) {
        System.out.println(a*a);
    }

    //method overloading --- method name same -- declaration changed --- can be achieved without inheritance
    void method2(int a, int b) {
        System.out.println(a+b);
    }
}


public class OverloadingVsOverriding {
    public static void main (String args[]) {

        XYZ xyz = new XYZ();
        xyz.method1(100);             //as this method is overridden, it will print only method from XYZ class
        xyz.method2(50);
        xyz.method2(50,150);

    }
}
