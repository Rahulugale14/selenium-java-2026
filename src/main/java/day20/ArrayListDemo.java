package day20;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
ArrayList is a class which implements List interface.
Collection & List are implemented by ArrayList.
1 --> Heterogeneous data - allowed
2 --> Insertion Order (Index order is followed)
3 --> Duplicate elements are allowed
4 --> Multiple nulls are allowed
 */

public class ArrayListDemo {


    public static void main (String args[]) {

        //1 --> Declaration of ArrayList
        ArrayList myList = new ArrayList();
        //  List myList = new ArrayList();                         //here child class object can hold into parent class variable. List is Parent Class
        //  ArrayList <String> myList = new ArrayList<String>();

        //2 --> Adding data into ArrayList
        myList.add(100);
        myList.add(14.5);
        myList.add("Welcome");
        myList.add('S');
        myList.add(true);
        myList.add(100);
        myList.add(null);
        myList.add(null);

        //3 --> Size of ArrayList
        System.out.println("Size of an ArrayList: " + myList.size());

        //4 --> Printing ArrayList
        System.out.println("Printing data from ArrayList: " + myList);

        //5 --> Remove element from ArrayList
        myList.remove(5);
        System.out.println("After removing 5th element, new ArrayList is: " + myList);

        //6 --> Insert element in ArrayList
        myList.add(3, "Java");
        System.out.println("After inserting element, UPDATED ArrayList is: " + myList);

        //7 --> Modify element /replace element in ArrayList
        myList.set(3, "Python");
        System.out.println("After replacing Java with Python element, UPDATED ArrayList is: " + myList);

        //8 --> access specific element from ArrayList
        System.out.println("Accessed Specific element is: " + myList.get(2));

        System.out.println("----------------------------------------------------------");

        //9 --> Reading all elements from ArrayList

                    //1st Approach - using for loop
                //for(int i=0; i<myList.size(); i++) {
                //    System.out.println(myList.get(i));
                //}

                    //2nd Approach - using for each loop
                //for (Object x:myList) {
                //    System.out.println(x);
                //}

                    //3rd Approach - using iterator
                Iterator itr = myList.iterator();             //using Iterator we can read all the data from collections
                    while(itr.hasNext()) {
                        System.out.println(itr.next());
                    }

        //10 --> Checking ArrayList empty or not
        System.out.println("Is ArrayList empty? " + myList.isEmpty());


        System.out.println("----------------------------------------------------------");


        //11 --> Remove all the elements from ArrayList
        ArrayList myList2 = new ArrayList();
        myList2.add("Welcome");
        myList2.add(100);

        myList.removeAll(myList2);
        System.out.println("After removing 2 elements, final ArrayList is: " + myList);
        System.out.println("ArrayList created by adding 2 elements from above methods: " + myList2);

        //12 --> Remove or Clear all the elements from ArrayList
        myList.clear();
        System.out.println("Is ArrayList empty? " + myList.isEmpty());



    }

}
