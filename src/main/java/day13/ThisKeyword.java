package day13;

import net.bytebuddy.asm.Advice;

public class ThisKeyword {

    // below are class/instance variables
    int x;
    int y;


    //below is a constructor with local variables
    ThisKeyword (int x, int y) {
        this.x=x;                               //this keyword represents class. remove both this & see the result
        this.y=y;
    }

    void display () {
        System.out.println(x);
        System.out.println(y);
    }



    public static void main (String args []) {

        ThisKeyword th = new ThisKeyword(100,200);
        th.display();

    }

}
