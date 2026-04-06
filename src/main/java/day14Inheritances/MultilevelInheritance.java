package day14Inheritances;


//this is a parent class
class AA {

    int a;
    void display() {
        System.out.println(a);
    }

}

//this is a child class
class BB extends AA {

    int b;
    void show() {
        System.out.println(b);
    }
}

//this is also child class. CC is grandchild of AA
class CC extends BB {

    int c;
    void print() {
        System.out.println(c);
    }
}


public class MultilevelInheritance {

    public static void main (String args[]) {

        CC obj = new CC();
        obj.a=1010;
        obj.b=2020;
        obj.c=3030;

        obj.display();
        obj.show();
        obj.print();


    }




}
