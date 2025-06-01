package GetterSetter;

public class Main {
    public static void main(String[] args) {
        Student stu=new Student();

        stu.setName("Saman");
        System.out.println("Name : "+stu.getname());

        stu.setID(2419);
        System.out.println("ID : "+stu.getID());

        stu.setAge(70);
        System.out.println("Age : "+stu.getAge());

    }
}
