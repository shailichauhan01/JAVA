// Create a class employee that contains employee id,name,department,salary of an employee.
// Where the gross salary is the combination of BAsic Salary+ DA+ HRA+ Some Medical Allowances.
// DA=20% of Basic Salary,HRA=15% of Basic salary
// Member Function are: getInfo() nad printInfo(),declare as public(),read and display all the information of employee class
// ass well as print the gross salary of an employee by creating take input asing Scanner Class.

import java.util.*;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double basicSalary;
    private double grossSalary;

    // Constructor
    public Employee(int employeeId, String name, String department, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.basicSalary = basicSalary;
        calculateGrossSalary();
    }

    // Function to calculate gross salary
    private void calculateGrossSalary() {
        double da = 0.20 * basicSalary;
        double hra = 0.15 * basicSalary;
        double medicalAllowance = 1000; // assuming a fixed medical allowance
        grossSalary = basicSalary + da + hra + medicalAllowance;
    }

    // Function to get employee information
    public void getInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Department: ");
        department = sc.nextLine();
        System.out.println("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
        calculateGrossSalary();
    }

    // Function to print employee information
    public void printInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(0, "", "", 0); // Default employee object

        System.out.println("Enter Employee Details:");
        emp.getInfo();

        System.out.println("\nEmployee Information:");
        emp.printInfo();
    }
}
