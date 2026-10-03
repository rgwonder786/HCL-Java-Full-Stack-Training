
/*
Employee Salary Filter: Given a list of employees, use the Streams API to find employees earning more than ₹50,000, sort them by salary, and collect their names into a list.
*/
import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}

public class b59 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Rahul", 45000),
                new Employee(102, "Amit", 65000),
                new Employee(103, "Priya", 80000),
                new Employee(104, "Neha", 55000),
                new Employee(105, "Vikas", 40000));

        List<String> result = employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("Employees earning more than ₹50,000:");
        System.out.println(result);
    }
}