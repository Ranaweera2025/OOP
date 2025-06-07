package ArrayList.student;

public class Student {
    private String name;
    private int id;
    private int year;

    public Student() {
        this.name="Test";
        this.id=0;
        this.year=0;
    }

    public Student(String name, int id, int year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public void dis(){
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("Year : "+year);
    }
}
