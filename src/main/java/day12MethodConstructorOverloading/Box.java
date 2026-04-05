package day12MethodConstructorOverloading;

public class Box {

    //Constructor Overloading

    double width, height, depth;

    //below is default Constructor. No parameters -----> 1st Constructor
    Box () {
        width=height=depth=0;
    }


    //below is parameterized Constructor. assigning the data into three variables ---> 2nd Constructor
    Box (double w, double h, double d) {
        width=w;
        height=h;
        depth=d;

    }

    // 3rd Constructor
    Box (double len) {
        width=height=depth=len;
    }

    double volume() {
        return(width*height*depth);
    }



}
