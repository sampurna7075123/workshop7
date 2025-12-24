package workshop7.question3;

public class MainClass {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.id = 1;
        employee1.name = "Ram";
        employee1.salary = 25000;

        Employee employee2 = new Employee();
        employee2.id = 2;
        employee2.name = "Sita";
        employee2.salary = 32000;

        Employee employee3 = new Employee();
        employee3.id = 3;
        employee3.name = "Hari";
        employee3.salary = 28000;

        System.out.println("Employee 1");
        System.out.println("Id: " + employee1.id);
        System.out.println("Name: " + employee1.name);
        System.out.println("Salary: " + employee1.salary);

        System.out.println();

        System.out.println("Employee 2");
        System.out.println("Id: " + employee2.id);
        System.out.println("Name: " + employee2.name);
        System.out.println("Salary: " + employee2.salary);

        System.out.println();

        System.out.println("Employee 3");
        System.out.println("Id: " + employee3.id);
        System.out.println("Name: " + employee3.name);
        System.out.println("Salary: " + employee3.salary);

        Employee highest = employee1;
        if (employee2.salary > highest.salary) {
            highest = employee2;
        }
        if (employee3.salary > highest.salary) {
            highest = employee3;
        }

        System.out.println();
        System.out.println("Highest Salary Employee");
        System.out.println("Id: " + highest.id);
        System.out.println("Name: " + highest.name);
        System.out.println("Salary: " + highest.salary);
    }
}