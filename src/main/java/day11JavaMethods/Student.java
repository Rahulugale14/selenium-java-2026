package day11JavaMethods;

public class Student {

    //below are Class variables
    int studentId;
    String studentName;
    char studentGrade;

    void printStudentData() {
        System.out.println(studentId + " " + studentName + " " + studentGrade);
    }


    //below are local variables in the method
    void setStudentData(int id, String name, char grade) {
        studentId=id;
        studentName=name;
        studentGrade=grade;
    }

    //below is the Constructor
    Student(int id, String name, char grade) {
        studentId=id;
        studentName=name;
        studentGrade=grade;
    }

}
