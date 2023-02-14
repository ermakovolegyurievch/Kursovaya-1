package course1;

class Employees {
    public static Employee[] abc = new Employee[10];

    public static void main(String[] args) {
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
        allEmployees();
        allFullNames();
        sumSalary();
        minSalaryEmploy();
        maxSalaryEmploy();
        middleSalaryAllEmployees();

    }

    public static void allEmployees() {
        System.out.println("Полные данные по всем сотрудникам:");
        for (Employee i : abc) {
            System.out.println(i);
        }
    }

    public static void allFullNames() {
        System.out.println("Список сотрудников:");
        for (Employee obj : abc) {
            System.out.print(obj.getSurName() + " ");
            System.out.print(obj.getFirstName() + " ");
            System.out.print(obj.getSecondName() + " ");
            System.out.println(" ");
        }
    }

    public static void sumSalary() {
        double sum = 0;
        for (Employee obj : abc) {
            sum += obj.getSalary();
        }
        System.out.println("Сумма всех зарплат - " + sum);
    }

    public static void minSalaryEmploy() {
        double minSalary = Integer.MAX_VALUE;
        for (Employee obj : abc) {
            if (minSalary > obj.getSalary()) {
                minSalary = obj.getSalary();
            }
        }
        System.out.println("Минимальная зарплата - " + minSalary);
    }

    public static void maxSalaryEmploy() {
        double maxSalary = Integer.MIN_VALUE;
        for (Employee obj : abc) {
            if (maxSalary < obj.getSalary()) {
                maxSalary = obj.getSalary();
            }
        }
        System.out.println("Максимальная зарплата - " + maxSalary);
    }

    public static void middleSalaryAllEmployees() {
        double sum = 0;
        for (Employee obj : abc) {
            sum += obj.getSalary();
        }
        System.out.println("Средняя зарплата - " + sum / abc.length);
    }
}