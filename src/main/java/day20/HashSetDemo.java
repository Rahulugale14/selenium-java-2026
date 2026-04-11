package day20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
HashSet is a class which implements Set interface.
1 --> Heterogeneous data - allowed
2 --> Insertion Order is not preserved (Index order is not followed)
3 --> Duplicate elements are not allowed
4 --> Multiple nulls are not allowed. Only one null is allowed
 */

public class HashSetDemo {

    public static void main (String args []) {

        //1 --> Declaration
        HashSet mySet = new HashSet();
        //Set mySet = new HashSet();
        //HashSet <String> mySet = new HashSet<String>();

        //2 --> adding elements into HashSet
        mySet.add(100);
        mySet.add(10.5);
        mySet.add("welcome");
        mySet.add(true);
        mySet.add('A');
        mySet.add(100);
        mySet.add(null);
        mySet.add(null);
        System.out.println(mySet);

        //3 --> Removing Element
        mySet.remove(10.5);                 //10.5 is a value & not and index
        System.out.println("After removing element: " + mySet);

        //4 --> Inserting element                           - not possible in HashSet
        //5 --> accessing/retreiving specific element       - not possible in HashSet

        //6 --> Convert HashSet to ArrayList
        ArrayList ar = new ArrayList(mySet);
        System.out.println(ar);
        System.out.println(ar.get(2));

        System.out.println("---------------------------------------------");

        //7 --> Read all the elements
                // 1st approach - using for each loop ---> (normal for loop not supported as there's no indexing in HashSet
        //              for(Object x:mySet) {
        //                  System.out.println(x);

        //        }

                // 2nd approach - using Iterator
                    Iterator <Object> itr = mySet.iterator();
                        while(itr.hasNext()) {
                            System.out.println(itr.next());
                        }


        System.out.println("---------------------------------------------");

        //8 --> Size of an HashSET
        System.out.println(mySet.size());

        //9 --> Clearing all elements from HashSet
        mySet.clear();
        System.out.println(mySet);



    }
}
