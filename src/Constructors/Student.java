package Constructors;

public class Student {
    private int ID;
    private String Name;
    private  int age;


    public Student() {
    }

    public Student(int ID, String name, int age) {
        this.ID = ID;
        Name = name;
        this.age = age;
    }

    public void Display(){
        System.out.println("ID : "+ID);
        System.out.println("Name : "+Name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        Student st=new Student();
        st.Display();
        st.age=12;

    }
}
