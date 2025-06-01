package Que_5;

public class PartTimeEmployeee extends Employee{

    private int OThours;

    public PartTimeEmployeee(){
        super();
        this.OThours=0;
    }

    public PartTimeEmployeee(String name, double salary, int OThours) {
        super(name, salary);
        this.OThours = OThours;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("OT Hours : "+OThours);
    }
}
