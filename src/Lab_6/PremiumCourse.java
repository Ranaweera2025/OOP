package Lab_6;

public class PremiumCourse extends Course{

    private boolean includeCertification;

    public PremiumCourse(){
        super();
        this.includeCertification=false;
    }

    public PremiumCourse(String courseID, String courseName, int durationWeeks,boolean includeCertification) {
        super(courseID, courseName, durationWeeks);
        this.includeCertification=includeCertification;
    }

    @Override
    public double calculateTotalFee() {
        if (includeCertification==true){
            return (150*durationWeeks)+50;
        }
        return 150*durationWeeks;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
    }
}


