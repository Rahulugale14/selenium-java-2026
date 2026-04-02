package assignments;

public class SortArray {

    public static void main (String [] args) {

        int a[] = {10,30,50,20,40};

        for (int i=0; i<a.length-1; i++) {
            for (int j=0; j<a.length-i-1; j++) {
                if (a[j] > a [j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
        System.out.print("Sorted Array: ");
        for (int num : a) {
            System.out.print(num + " ");

        }


    }

}
