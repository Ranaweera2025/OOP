package Que_3;

public class Student {
    protected String name;
    protected int age;

    public Student() {
        this.name="";
        this.age=0;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayinfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
