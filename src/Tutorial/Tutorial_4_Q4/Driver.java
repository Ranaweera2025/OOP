package Tutorial.Tutorial_4_Q4;

public class Driver {
    private String name;
    private String licenseNumber;

    public Driver() {
        name="";
        licenseNumber="";
    }

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
    }


    public void displaydriver(){
        System.out.println("Driver name : "+name);
        System.out.println("License Number : "+licenseNumber);
    }
}
