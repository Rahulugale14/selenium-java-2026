package day19;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class TypeCastingObjects2 {

    public static void main (String args []) {


        //Rule1 ---> Conversion is valid or invalid
        //              As shown above, the type of 'd' & 'c' must have some relationship (either parent to child or vice versa)

        //Rule2 ---> Assignment is valid or invalid
        //              'c' must be either same or child of 'a'

        //Rule3 ---> The underlying object type of 'd' must be either same or child of 'c'


        /*

        //type casting expression====> A  b  = (C) d;

        1 --> Animal an = new Dog();
              Cat ct = (Cat) an;                --> valid as per rule1

        2 --> Dog dg = new Dog();
              Cat ct = (Cat) an;                --> invalid as per rule1

        3 --> Animal an = new Dog();
              Cat ct = (Cat) an;                --> valid as per rule2

        4 --> Animal an = new Dog();
              Cat ct = (Dog) an;                --> invalid as per rule1

        5 --> Animal an = new Dog();
              Cat ct = (Cat) an;                --> invalid as per rule3

         */


        //Combining rule1, rule2 & rule3
        Animal an = new Dog();
        Dog dg = (Dog) an;


    }
}
