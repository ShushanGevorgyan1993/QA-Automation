package am.picsartacademy.OOP;

import am.picsartacademy.OOP.Models.Employee;
import am.picsartacademy.OOP.Models.Human;
import am.picsartacademy.OOP.Models.Student;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.firstName = "Alex";
        human.lastName = "Sargsyan";
        human.age = 23;
        human.gender = 'M';
        human.married = false;
        human.nationality = "armenian";
        human.degree = true;

        Student laura = new Student();
        laura.firstName = "Laura";
        laura.lastName = "Avagyan";
        laura.age = 25;
        laura.gender = 'F';
        laura.married = true;
        laura.nationality = "Armenian";
        laura.degree = true;

        Employee emp = new Employee();
        emp.firstName = "Gayane";
        emp.lastName = "Gevorgyan";
        emp.age = 30;
        emp.gender = 'F';
        emp.married = true;
        emp.nationality = "Armenian";
        emp.degree = true;
        emp.manager  = "Mariam";

    }
}

