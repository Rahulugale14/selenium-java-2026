package day15;

class Test {
    final int x=100;
}

public class FinalKeywordForVariables {
    public static void main (String args[]) {

        Test test = new Test();
        System.out.println(test.x);

        //test.x=2500;                       //cannot change value as x is final variable
        //System.out.println(test.x);
    }
}
