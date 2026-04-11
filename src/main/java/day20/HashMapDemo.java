package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main (String [] args) {

        //1 --> Declaration
        //HashMap hm = new HashMap();
        //Map hm = new HashMap();

        HashMap <Integer, String> hm = new HashMap<Integer, String>();

        //2 --> Adding pairs
        hm.put(101, "John");                    //put method to change values of the specific data
        hm.put(102, "Scott");
        hm.put(103, "Marry");
        hm.put(104, "Scott");
        hm.put(102, "David");
        System.out.println(hm);

        //3 --> Size of a HashMap
        System.out.println("Size of hashmap: " + hm.size());

        //4 --> remove pair
        hm.remove(103);
        System.out.println("After removing a pair:" + hm);

        System.out.println("----------------------------------------------------------");

        //5 --> access value of the key
        System.out.println(hm.get(102));

        //6 --> get all the keys from hashmap
        System.out.println(hm.keySet());

        //7 --> get all the values from hashmap
        System.out.println(hm.values());

        //6 --> get all the keys & all the values from hashmap
        System.out.println(hm.entrySet());

        System.out.println("----------------------------------------------------------");

        //7 --> Reading data from HashMap
                //(normal for loop not supported as there's no indexing in HashSet

                //1st Approach ------> Using for each loop / enhanced for loop
                for(int k: hm.keySet()) {
                    System.out.println(k + " " + hm.get(k));
                }

                //2nd Approach ------> using Iterator
                //Iterator <Map.Entry<Integer, String>> itr =hm.entrySet().iterator();
                //while(itr.hasNext()) {
                //    Map.Entry<Integer, String> entry = itr.next();
                //    System.out.println(entry.getKey() + " " + entry.getValue());
                //}

        //8 --> clearing record
        hm.clear();
        System.out.println(hm.isEmpty());


    }
}
