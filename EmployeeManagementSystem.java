import java.util.ArrayList;
import java.util.List;

// Employee class representing an employee
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.printf("Employee ID: %d\nName: %s\nSalary: $%.2f per year\n", id, name, salary);
        System.out.println("--------------------------------------");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Monica Geller", 70000));
        employees.add(new Employee(102, "Ross Geller", 75000));
        employees.add(new Employee(103, "Phoebe Buffay", 65000));

        // Displaying employee details
        System.out.println("Employee Details:\n------------------------");
        employees.forEach(Employee::displayDetails);
    }
}
 