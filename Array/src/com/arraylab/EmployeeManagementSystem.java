package com.arraylab;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Employee {
	    private int id;
	    private String name;
	    private int age;
	    private double salary;

	    public Employee(int id, String name, int age, double salary) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}

	public class EmployeeManagementSystem {
	    private static List<Employee> employeeList = new ArrayList<>();
	    private static int nextId = 1;

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Employee Management System Menu:");
	            System.out.println("1. Create Employee");
	            System.out.println("2. Read Employee");
	            System.out.println("3. Update Employee");
	            System.out.println("4. Delete Employee");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    createEmployee(scanner);
	                    break;
	                case 2:
	                    readEmployee(scanner);
	                    break;
	                case 3:
	                    updateEmployee(scanner);
	                    break;
	                case 4:
	                    deleteEmployee(scanner);
	                    break;
	                case 5:
	                    System.out.println("Exiting Employee Management System.");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }

	    private static void createEmployee(Scanner scanner)
	    {
	        System.out.print("Enter employee name: ");
	        String name = scanner.nextLine();
	        
	        System.out.print("Enter employee age: ");
	        int age = scanner.nextInt();
	        
	        System.out.print("Enter employee salary: ");
	        double salary = scanner.nextDouble();
	        

	        Employee employee = new Employee(nextId++, name, age, salary);
	        employeeList.add(employee);

	        System.out.println("Employee created with ID: " + (nextId - 1));
	    }

	    private static void readEmployee(Scanner scanner) {
	        System.out.print("Enter employee ID: ");
	        int id = scanner.nextInt();
	        Employee employee = findEmployeeById(id);

	        if (employee != null) {
	            System.out.println("Employee ID: " + employee.getId());
	            System.out.println("Name: " + employee.getName());
	            System.out.println("Age: " + employee.getAge());
	            System.out.println("Salary: " + employee.getSalary());
	        } else {
	            System.out.println("Employee not found with ID: " + id);
	        }
	    }

	    private static void updateEmployee(Scanner scanner) {
	        System.out.print("Enter employee ID: ");
	        int id = scanner.nextInt();
	        Employee employee = findEmployeeById(id);

	        if (employee != null) {
	            System.out.print("Enter new salary: ");
	            double newSalary = scanner.nextDouble();
	            employee.setSalary(newSalary);
	            System.out.println("Salary updated successfully.");
	        } else {
	            System.out.println("Employee not found with ID: " + id);
	        }
	    }

	    private static void deleteEmployee(Scanner scanner) {
	        System.out.print("Enter employee ID: ");
	        int id = scanner.nextInt();
	        Employee employee = findEmployeeById(id);

	        if (employee != null) {
	            employeeList.remove(employee);
	            System.out.println("Employee deleted successfully.");
	        } else {
	            System.out.println("Employee not found with ID: " + id);
	        }
	    }

	    private static Employee findEmployeeById(int id) {
	        for (Employee employee : employeeList) {
	            if (employee.getId() == id) {
	                return employee;
	            }
	        }
	        return null;
	    }
	}


