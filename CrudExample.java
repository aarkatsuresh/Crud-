import java.util.ArrayList;
import java.util.List;

class Employee {

    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class CrudExample {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        // CREATE
        employees.add(new Employee(1, "Suresh"));
        employees.add(new Employee(2, "Rahul"));

        // READ
        System.out.println("Employees:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // UPDATE
        for (Employee e : employees) {
            if (e.id == 1) {
                e.name = "Suresh Kumar";
            }
        }

        System.out.println("\nAfter Update:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // DELETE
        employees.removeIf(e -> e.id == 2);

        System.out.println("\nAfter Delete:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}