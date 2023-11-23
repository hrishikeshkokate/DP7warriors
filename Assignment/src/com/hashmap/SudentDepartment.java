package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class SudentDepartment {
	
	public static void main(String[] args) {
		
		Department dept1 = new Department(1, "Computer Science");
        Department dept2 = new Department(2, "Electrical Engineering");
        Department dept3 = new Department(3, "Mechanical Engineering");
        Department dept4 = new Department(4, "Physics");
       
        dept1.addStudent(new Student(101, "Pralay"));
        dept1.addStudent(new Student(102, "Shivam"));
        dept2.addStudent(new Student(201, "Kailash"));
        dept2.addStudent(new Student(202, "Hrishikesh"));
        dept3.addStudent(new Student(301, "Suraj"));
        dept3.addStudent(new Student(302, "Anuj"));
        dept4.addStudent(new Student(401, "Vishal"));
        dept4.addStudent(new Student(402, "Aniket"));
        
        Map<Integer, Department> departmentMap = new HashMap<>();
        departmentMap.put(dept1.getId(), dept1);
        departmentMap.put(dept2.getId(), dept2);
        departmentMap.put(dept3.getId(), dept3);
        departmentMap.put(dept4.getId(), dept4);

        
        for (Department department : departmentMap.values()) {
            System.out.println("Department ID: " + department.getId());
            System.out.println("Department Name: " + department.getName());
            System.out.println("Students in the department:");
            for (Student student : department.getList()) {
                System.out.println(student);
            }
            System.out.println();
        }
        
        System.out.println("-----------------------------------");
        
        // a. Create 1 Department object with an already used ID and add Students to the department
        Department dept5 = new Department(1, "Chemistry");  // Reusing ID 1
        dept5.addStudent(new Student(501, "Abhishek"));
        dept5.addStudent(new Student(502, "Chetan"));

        // b. Add the Department object with Dept ID as key and Dept object as value
        departmentMap.put(dept5.getId(), dept5);

        // c. Observe how many elements are present in the Map and iterate through the elements
        System.out.println("Total departments in the Map: " + departmentMap.size());
        for (Department department : departmentMap.values()) {
            System.out.println("Department ID: " + department.getId());
            System.out.println("Department Name: " + department.getName());
            System.out.println("Students in the department:");
            for (Student student : department.getList()) {
                System.out.println(student);
            }
            System.out.println();
        }
        
        System.out.println("-----------------------------------");
        
        Department dept6 = new Department(1, "Biology");  // Reusing ID 1
        dept6.addStudent(new Student(601, "Dipti"));
        dept6.addStudent(new Student(602, "Pratiksha"));
 
        departmentMap.put(dept6.getId(), dept6);
        
        System.out.println("Total departments in the Map: " + departmentMap.size());
        for (Department department : departmentMap.values()) {
            System.out.println("Department ID: " + department.getId());
            System.out.println("Department Name: " + department.getName());
            System.out.println("Students in the department:");
            for (Student student : department.getList()) {
                System.out.println(student);
            }
            System.out.println();
        }
        
        System.out.println("-----------------------------------");
        
        Department dept7 = new Department(1, "Biology");  // Reusing ID 1
        dept6.addStudent(new Student(601, "Harshada"));
        dept6.addStudent(new Student(602, "Shivani"));
        
        departmentMap.put(dept7.getId(), dept6);
        
        System.out.println("Total departments in the Map: " + departmentMap.size());
        for (Department department : departmentMap.values()) {
            System.out.println("Department ID: " + department.getId());
            System.out.println("Department Name: " + department.getName());
            System.out.println("Students in the department:");
            for (Student student : department.getList()) {
                System.out.println(student);
            }
            System.out.println();
        }
        
        System.out.println("-----------------------------------");









	}

}
