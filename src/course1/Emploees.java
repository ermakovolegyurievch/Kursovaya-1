package course1;

import java.util.HashMap;
import java.util.Map;

class Employees {

    private static final Map<String, Employee> employeesBook = new HashMap<>();

    public static void main(String[] args) {
        add(new Employee("Иванов", "Иван", "Иваныч", 1, 30.000));
        add(new Employee("Иванов", "Иван", "Иваныч", 1, 30.000));
        add(new Employee("Петров", "Петр", "Петрович", 2, 40.000));
        add(new Employee("Сергеев", "Сергей", "Сергеевич", 3, 10.000));
        add(new Employee("Андреев", "Андрей", "Андреевич", 4, 20.000));
        add(new Employee("Алексеев", "Алексей", "Алексеевич", 2, 50.000));
        add(new Employee("Дмитриев", "Дмитрий", "Дмитриевич", 3, 30.000));
        add(new Employee("Владимиров", "Владимир", "Владимирович", 5, 70.000));
        add(new Employee("Сидоров", "Сидор", "Сидорович", 3, 20.000));
        add(new Employee("Максимов", "Максим", "Максимович", 4, 40.000));
        add(new Employee("Ильин", "Илья", "Ильич", 1, 50.000));
        allEmployees();
        allFullNames(employeesBook);
        sumSalary();
        minSalaryEmploy();
        maxSalaryEmploy();
        middleSalaryAllEmployees();

    }

    private static String getKey(Employee employee) {
        return employee.getSurName() + " " + employee.getFirstName() + " " + employee.getSecondName();
    }

    public static void add(Employee employee) {
        employeesBook.put(getKey(employee), employee);
    }

    public static void remove(Employee employee) {
        employeesBook.remove(getKey(employee));
    }

    public static boolean find(Employee employee) {
        return (employeesBook.containsKey(getKey(employee)));
    }

    public static void allEmployees() {
        System.out.println("Полные данные по всем сотрудникам:");
        for (Employee emp : employeesBook.values()) {
            System.out.println(emp);
        }
    }


    public static void allFullNames(Map<String, Employee> map) {
        System.out.println("Список сотрудников:");
        for (Employee emp : map.values()) {
            System.out.println(emp.getSurName() + " " + emp.getFirstName() + " " + emp.getSecondName());
        }
    }


    public static void sumSalary() {
        double sum = 0;
        for (Employee emp : employeesBook.values()) {
            sum += emp.getSalary();
        }
        System.out.println("Сумма всех зарплат - " + sum);
    }

    public static void minSalaryEmploy() {
        double minSalary = Integer.MAX_VALUE;
        for (Employee emp : employeesBook.values()) {
            if (minSalary > emp.getSalary()) {
                minSalary = emp.getSalary();
            }
        }
        System.out.println("Минимальная зарплата - " + minSalary);
    }

    public static void maxSalaryEmploy() {
        double maxSalary = Integer.MIN_VALUE;
        for (Employee emp : employeesBook.values()) {
            if (maxSalary < emp.getSalary()) {
                maxSalary = emp.getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + maxSalary);
    }

    public static void middleSalaryAllEmployees() {
        double sum = 0;
        for (Employee emp : employeesBook.values()) {
            sum += emp.getSalary();
        }
        System.out.println("Средняя зарплата - " + sum / employeesBook.size());
    }
}