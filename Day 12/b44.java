//Stream with Objects
import java.util.*;

class Employee {

    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class b44 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(101, "Rahul", 50000),
            new Employee(102, "Amit", 70000),
            new Employee(103, "Neha", 60000)
        );

        employees.stream()
                 .filter(e -> e.salary > 55000)
                 .forEach(e ->
                     System.out.println(e.name)
                 );
    }
}