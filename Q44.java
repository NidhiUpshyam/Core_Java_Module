//44.Create three classes
//-Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
//-FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
//-PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )

import java.util.Scanner;

class Faculty {
    private int facultyID;
    private double salary;

    Faculty() {
        salary = 0;
    }

    void input(int facultyID) {
        this.facultyID = facultyID;
    }

    protected double getSalary() {
        return salary;
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("The salary of facultyID: " + facultyID + " is " + salary + " Rs.");
    }

}

class FullTimeFaculty extends Faculty {
    private double basicSalary;
    private double allowance;

    FullTimeFaculty() {
        super();
        basicSalary = 0;
        allowance = 0;

    }

    void input(int facultyID, double basicSalary, double allowance) {
        input(facultyID);
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        setSalary(basicSalary + allowance);
    }

}

class PartTimeFaculty extends Faculty {
    private double workingHour;
    private double ratePerHour;

    PartTimeFaculty() {
        super();
        workingHour = 0;
        ratePerHour = 0;

    }

    void input(int facultyID, double workingHour, double ratePerHour) {
        input(facultyID);
        this.workingHour = workingHour;
        this.ratePerHour = ratePerHour;
        setSalary(workingHour * ratePerHour);
    }

}

public class Q44 {
    public static void main(String[] args) {

        FullTimeFaculty f = new FullTimeFaculty();
        PartTimeFaculty p = new PartTimeFaculty();

        f.input(100, 5000, 2000);
        p.input(200, 10, 100);

        f.printSalary();
        p.printSalary();

    }
}

