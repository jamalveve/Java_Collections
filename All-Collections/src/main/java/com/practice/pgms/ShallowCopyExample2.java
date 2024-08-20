package com.practice.pgms;

class Department {
    String empId;
    String designation;

    public Department(String empId, String designation) {
        this.empId = empId;
        this.designation = designation;
    }
}

class Employee implements Cloneable {
    int id;
    String name;
    Department dept;

    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    // Default version of clone() method
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // This creates a shallow copy
    }
}

public class ShallowCopyExample2 {
    public static void main(String[] args) {
        Department dept1 = new Department("1", "AVP");
        Employee emp1 = new Employee(111, "John", dept1);
        Employee emp2 = null;

        try {
            // Creating a clone of emp1 and assigning it to emp2
        	  emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Modifying the designation of the cloned employee's department
        emp2.dept.designation = "Director";

        // Prints "Director" since emp1 points to the same department object
        System.out.println("Original Employee's Department Designation: " + emp1.dept.designation);
    }
}
