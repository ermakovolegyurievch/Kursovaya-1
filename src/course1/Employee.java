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

class Employees {
    public static void main(String[] args) {
        Employee[] abc = new Employee[10];
        abc[0] = new Employee("Иванов", "Иван", "Иваныч", 1, 30.000);
        abc[1] = new Employee("Петров", "Петр", "Петрович", 2, 40.000);
        abc[2] = new Employee("Сергеев", "Сергей", "Сергеевич", 3, 10.000);
        abc[3] = new Employee("Андреев", "Андрей", "Андреевич", 4, 20.000);
        abc[4] = new Employee("Алексеев", "Алексей", "Алексеевич", 2, 50.000);
        abc[5] = new Employee("Дмитриев", "Дмитрий", "Дмитриевич", 3, 30.000);
        abc[6] = new Employee("Владимиров", "Владимир", "Владимирович", 5, 70.000);
        abc[7] = new Employee("Сидоров", "Сидор", "Сидорович", 3, 20.000);
        abc[8] = new Employee("Максимов", "Максим", "Максимович", 4, 40.000);
        abc[9] = new Employee("Ильин", "Илья", "Ильич", 1, 50.000);
        allEmployees(abc);
        allFullNames(abc);
        sumSalary(abc);
        minSalaryEmploy(abc);
        maxSalaryEmploy(abc);
        middleSalaryAllEmployees(abc);
    }

    public static void allEmployees(Employee[] a) {
        System.out.println("Полные данные по всем сотрудникам:");
        for (Employee i : a) {
            System.out.println(i);
        }
    }
    public static void allFullNames (Employee[] a) {
        System.out.println("Список сотрудников:");
        for (Employee obj : a) {
            System.out.print(obj.getSurName()+" ");
            System.out.print(obj.getFirstName()+" ");
            System.out.print(obj.getSecondName()+" ");
            System.out.println(" ");
        }
    }
    public static void sumSalary(Employee[] a) {
        double sum = 0;
        for (Employee obj : a) {
            sum += obj.getSalary();
        }
        System.out.println("Сумма всех зарплат - "+sum);
    }

    public static void minSalaryEmploy(Employee[] a) {
        double minSalary = Integer.MAX_VALUE;
        for (Employee obj : a) {
            if( minSalary > obj.getSalary()){
                minSalary = obj.getSalary();
            }
        }
        System.out.println("Минимальная зарплата - "+minSalary);
    }
    public static void maxSalaryEmploy (Employee[] a) {
        double maxSalary = Integer.MIN_VALUE;
        for (Employee obj : a) {
            if( maxSalary < obj.getSalary()){
                maxSalary = obj.getSalary();
            }
        }
        System.out.println("Максимальная зарплата - "+maxSalary);
    }
    public static void middleSalaryAllEmployees (Employee[] a) {
        double sum = 0;
        for (Employee obj : a) {
            sum += obj.getSalary();
        }
        System.out.println("Средняя зарплата - "+sum /a.length);
    }
}
