package day19;

//Upcasting: converting value from smaller to larger
// int -> long
// float -> double

//Downcasting: converting value from higher to lower
// long -> int
// double -> float


public class TypeCastingConcept {

    public static void main (String args []) {

        //upcasting - automatic ---- smaller to higher
        int intValue = 100;
        long longValue = intValue;
        System.out.println(longValue);

        float floatValue = 10.5f;
        double doubleValue = floatValue;
        System.out.println(doubleValue);


        //downcasting - manual ---- larger to smaller
        long longVal = 100000;
        int intVal = (int)longVal;
        System.out.println(intVal);

        double doubleVal = 1405.1103;           //if this is increased, there are chances of missing values
        float floatVal = (float)doubleVal;
        System.out.println(floatVal);



    }
}
