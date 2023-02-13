package course1;

public class Employee {
    public static int counter = 1;
    int id;
    private final String surName, firstName, secondName;
    private int department;
    private double salary;

    public Employee(String surName, String firstName, String secondName, int department, double salary) {

        this.surName = surName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + ") " + surName + " " + firstName + " " + secondName + ", отдел № " + department + ", зарплата: " + salary;
    }
}


