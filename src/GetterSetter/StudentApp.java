package GetterSetter;

public class StudentApp {
    public static void main(String[] args) {
        School sh=new School();

        sh.setStuId(-1);
        sh.setName("Saman");
        sh.setBatchID(45);


        System.out.println("student ID : "+sh.getStuId());
        System.out.println("Student name : "+sh.getName());
        System.out.println("Batch ID : "+sh.getBatchID());


    }
}
