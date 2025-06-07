package Static_Members;

public class Student {
    private String name;
    private int id;
    private static String batch;
    static int num;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void setbatch(String batch){
        this.batch =batch;
    }

    static {
        System.out.println("I am comming from the static block--------");
        num=20;
    }

    public void dispaly(){
        System.out.print("Name : "+name+"  ");
        System.out.print("ID : "+id+"  ");
        System.out.print("Batch : "+batch+"  ");
        System.out.println("Number : "+num);
        System.out.println();
    }
}
