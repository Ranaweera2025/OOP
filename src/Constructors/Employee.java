package Constructors;

class Employee {
    private int Id;

    public Employee() {
        System.out.println("Employee Constructor called");
    }
    public Employee(int id) {
        this.Id = id;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager() {
        System.out.println("Manager Constructor called");
    }
    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }
}

class Company {
    public static void main(String[] args) {
        Manager m = new Manager();
    }
}

