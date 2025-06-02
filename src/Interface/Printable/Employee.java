package Interface.Printable;

public class Employee implements Printable{
    private String name;
    private int id;
    private String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public void printdetails() {
        System.out.println("Employee Details");
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Departmnt : "+department);
    }
}
