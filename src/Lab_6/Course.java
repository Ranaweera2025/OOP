package Lab_6;

public class Course {
    protected String courseID;
    protected String courseName;
    protected int durationWeeks;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.durationWeeks=0;
    }

    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }
    public void displayCourseDetails(){
        System.out.println("course ID :"+courseID);
        System.out.println("course Name :"+courseName);
        System.out.println("duration Weeks :"+durationWeeks);
    }

    public double calculateTotalFee() {
        return 10000.0;
    }
    public double calculateTotalFee(double discount){
        return calculateTotalFee()*(1-discount/100);
    }


    public static void main(String[] args) {
        Course co=new Course("IT34","java",3);

        co.displayCourseDetails();
        System.out.println("Total fee :"+co.calculateTotalFee(5));

        System.out.println();

        RegularCourse rc=new RegularCourse("IT38","java",9,false);
        System.out.println("Total fee :"+rc.calculateTotalFee(10));
        rc.displayCourseDetails();

        System.out.println();

        PremiumCourse pc=new PremiumCourse("2058","python",12,true);
        pc.displayCourseDetails();
        System.out.println("Tatal Fee :"+pc.calculateTotalFee());

    }
}

