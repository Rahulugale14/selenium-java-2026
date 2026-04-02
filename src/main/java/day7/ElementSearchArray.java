package day7;

public class ElementSearchArray {

    public static void main (String args []) {


        //using for loop
        int a[] = {10,20,30,40,50};
        int searchElement1 = 40;
        boolean status = false;

            for (int i=0; i<a.length; i++) {
                if (a[i]==searchElement1) {
                  System.out.println("Element found");
                  status=true;
                  break;
                }
            }
            if (status==false) {
                System.out.println("Element not found");
            }

            //using for each loop
        int ar[] = {100,200,300,400,500};
        int searchElement2 = 2000;
        boolean statuss = false;

        for (int x:ar) {
            if (x == searchElement2) {
                System.out.println("Element Found");
                statuss = true;
                break;
            }
        }
            if (statuss==false) {
                System.out.println("Element not found");
                }


    }


}
