package com.practice.pgms;

class Departments {
    String empId;
    String designation;

    public Departments(String empId, String designation) {
        this.empId = empId;
        this.designation = designation;
    }

    // Method to create a deep copy of Department
    public Departments deepCopy() {
        return new Departments(this.empId, this.designation);
    }
}

class Employees {
    int id;
    String name;
    Departments depts;

    public Employees(int id, String name, Departments depts) {
        this.id = id;
        this.name = name;
        this.depts = depts;
    }

    // Method to create a deep copy of Employee
    public Employees deepCopy() {
        return new Employees(this.id, this.name, this.depts.deepCopy());
    }
}

public class DeepCopyExample2 {
    public static void main(String[] args) {
        Departments dept1 = new Departments("1", "AVP");
        Employees emp1 = new Employees(111, "John", dept1);

        // Creating a deep copy of emp1
        Employees emp2 = emp1.deepCopy();

        // Modifying the designation in emp2's department
        emp2.depts.designation = "Director";

        // Prints "AVP", showing that emp1's department remains unaffected
        System.out.println("Original Employee's Department Designation: " + emp1.depts.designation);
        System.out.println("cloned Employee's Department Designation: " + emp2.depts.designation);

    }
}
