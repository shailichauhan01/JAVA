// Create a class employee that contains employee id,name,department,salary of an employee.
// Where salary is the combination of Basic Salary+ DA+ HRA+ Some Other.
// DA=10% of Basic Salary,HRA=15% of Basic salary
// 1- With the help of array of object read & display the information of employee along with the total Salary.
// 2-Create a search,method that searches a valid employee id,out of n records and if found,it display the overall info of employee along with Total Salary.
// Use Scanner Class For taking input.

import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double basicSalary;

    public Employee(int id, String name, String department, double basicSalary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public double calculateTotalSalary() {
        double da = 0.10 * basicSalary;
        double hra = 0.15 * basicSalary;
        // Add other components if needed
        return basicSalary + da + hra; // + other components
    }

    public void getInfo(Scanner scanner) {
        System.out.print("ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Name: ");
        this.name = scanner.nextLine();
        System.out.print("Department: ");
        this.department = scanner.nextLine();
        System.out.print("Basic Salary: ");
        this.basicSalary = scanner.nextDouble();
    }

    public void printInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

public class Employee2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        // Read employee information
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            employees[i] = new Employee(0, "", "", 0); // Initialize with default values
            employees[i].getInfo(scanner);
        }

        // Display employee information
        for (Employee emp : employees) {
            emp.printInfo();
        }

        // Search employee by ID
        System.out.print("Enter the employee ID to search: ");
        int searchId = scanner.nextInt();
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getId() == searchId) {
                System.out.println("Employee found:");
                emp.printInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee not found.");
        }

        scanner.close();
    }
}

