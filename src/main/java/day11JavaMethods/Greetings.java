package day11JavaMethods;

public class Greetings {

    //1st Method ---> No params/arguments     no return value
    void met1() {
        System.out.println("Hello....");
    }

    //2nd Method ---> No params/arguments     returns value
    String met2() {
        return("Bring me Thanos");
    }

    //3rd Method ---> Takes params/arguments     but no return value
    void met3(String name) {
        System.out.println("Yes thanos is dead " + name);
    }

    //4th Method ---> Takes params/arguments     also returns value
    String met4(String name) {
        return("Hello " + name);
    }


}
