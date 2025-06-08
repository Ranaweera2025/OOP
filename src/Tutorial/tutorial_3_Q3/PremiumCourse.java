package Tutorial.tutorial_3_Q3;

public class PremiumCourse extends Course{

    private boolean includeCertification;

    public PremiumCourse(){
        super();
        this.includeCertification=false;
    }


    public PremiumCourse(int courseId, String coursename, int durationWeeks, boolean includeCertification) {
        super(courseId, coursename, durationWeeks);
        this.includeCertification = includeCertification;
    }


    @Override
    public double calculatefee() {
        if(includeCertification){
            return (150*durationWeeks)+50;
        }
        return 150*durationWeeks;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Iclude certification :"+(includeCertification? "YES":"NO"));
        System.out.println("Total Fee : "+calculatefee());
    }
}
