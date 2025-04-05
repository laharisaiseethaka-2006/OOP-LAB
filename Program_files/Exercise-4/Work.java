class Employee {

int empId;

String name;

Employee(int empId, String name) {

this.empId = empId;

this.name = name;

}

void displayDetails() {

System.out.println("Employee ID: " + empId);

System.out.println("Employee Name: " + name);

}

}

class Manager extends Employee {

String department;

Manager(int empId, String name, String department) {

super(empId, name);

this.department = department;

}

void displayManagerDetails() {

displayDetails();

System.out.println("Department: " + department);

}

}

public class Work {

public static void main(String[] args) {

Manager manager = new Manager (101, "John Doe", "HR");

manager.displayManagerDetails();

}

}