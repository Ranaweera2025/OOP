package Method_Overloaading;

public class Employee {
    private int ID;
    private String name;
    private double Salary;
    private String department;

    public void Employee(){
        this.ID=10;
        this.name="Saman";
        this.Salary=50000.0;
        this.department="IT";
    }

    public void display(){
        System.out.println("ID : "+ID);
        System.out.println("Name : "+name);
        System.out.println("Salary : "+Salary);
        System.out.println("Department : "+department);
    }
}
