package tutorial_3_Q3;

public class Course {
     protected int courseId;
     protected String coursename;
     protected int durationWeeks;

    public Course() {

        this.courseId=0;
        this.coursename="";
        this.durationWeeks=0;
    }

    public Course(int courseId, String coursename, int durationWeeks) {
        this.courseId = courseId;
        this.coursename = coursename;
        this.durationWeeks = durationWeeks;
    }

    public void Display (){
        System.out.println("Course ID : "+courseId);
        System.out.println("Course name : "+coursename);
        System.out.println("Duraton Weeks : "+durationWeeks);
    }

    public double calculatefee(){
        return 10000;
    }


    public double calculatefee(int discount){
        double dis=calculatefee()*discount/100;
        return calculatefee()-dis;
    }
}
