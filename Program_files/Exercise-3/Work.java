class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

       public void work() {
        System.out.println(name + " is managing the team");
    }
}

public class Work {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice");
        manager.work();  
    }
}
