package Que_5;

public class Employee {
    protected String name;
    protected double salary;

    public Employee() {
        this.name="";
        this.salary=0;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}
