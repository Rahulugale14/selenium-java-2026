package day10ClassesAndObjects;

public class EmployeeStudentMain {

    public static void main (String[] args) {

        //creating objects in the main method
        Employee emp1 = new Employee();
        emp1.empId = 123;
        emp1.empName = "Rahul";
        emp1.empJobRole = "Professional PEGA QA Specialist";
        emp1.empSalary = 107500;
        emp1.display();

        System.out.println("--------------------------------------");

        Employee emp2 = new Employee();
        emp2.empId = 456;
        emp2.empName = "Surabhi";
        emp2.empJobRole = "Junior GoLang Developer";
        emp2.empSalary = 70000;
        emp2.display();

        System.out.println("--------------------------------------");

        Student st1 = new Student();
        st1.studnetId = 1405;
        st1.studentName = "Tony Stark";
        st1.grade = 'A';
        st1.studentDetails();

        System.out.println("--------------------------------------");

        Student st2 = new Student();
        st2.studnetId = 5555;
        st2.studentName = "Peter Parker";
        st2.grade = 'B';
        st2.studentDetails();


    }

}
