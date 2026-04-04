package day11JavaMethods;

public class StudentMain {

    public static void main (String args []) {

        /*

        Student st = new Student();

        //1) ---> store data using object reference variables
        st.studentId = 1405;
        st.studentName = "Rahul";
        st.studentGrade = 'R';
        st.printStudentData();

        //2) ---> using method to store data
        st.setStudentData(1103, "Surabhi", 'S');
        st.printStudentData();

        */



        //3) ---> Using a Constructor                                       //comment out this to run 1&2
        Student st = new Student(1114,"Sharu", 'R');
        st.printStudentData();


    }

}
