package day12MethodConstructorOverloading;

public class OverloadMainMethod {


    void main(int x) {
        System.out.println(x);
    }

    void main(String s) {
        System.out.println(s);
    }

    void main(String s1, String s2) {
        System.out.println(s1+s2);
    }

    public static void main (String [] args) {

        OverloadMainMethod ovm = new OverloadMainMethod();
        ovm.main(110111);
        ovm.main("RRR");
        ovm.main("RRRR", "SSSS");
    }

}
