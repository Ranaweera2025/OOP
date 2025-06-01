package Tutorial;

public class Employee {

    protected String empID;
    protected String empName;
    protected double empSalary;
    protected double rating;


    public Employee() {
        this.empID="";
        this.empName="";
        this.empSalary=30000;
        this.rating=2;
    }

    public Employee(String empID, String empName, double empSalary, double rating) {
        this.empID = empID;
        this.empName = empName;
        this.empSalary = empSalary;
        this.rating = rating;
    }

    public double calculatesalary(){
        return 30000;
    }

    public double calculatesalary(int percentage){
        double bonus=30000*calculatesalary();
        double TotSalary=calculatesalary()+bonus;
        return  TotSalary;
    }
}
