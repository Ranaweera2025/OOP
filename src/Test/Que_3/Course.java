package Test.Que_3;

public class Course extends Student{

    private String coursename;

    public Course(){
        super();
        this.coursename="";
    }

    public Course(String name, int age, String coursename) {
        super(name, age);
        this.coursename = coursename;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Course Name : "+coursename);
    }
}
