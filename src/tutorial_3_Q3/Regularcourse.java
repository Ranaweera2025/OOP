package tutorial_3_Q3;

public class Regularcourse extends Course{

    protected boolean hasLiveSessions;

    public Regularcourse(){
        super();
        this.hasLiveSessions=false;
    }


    public Regularcourse(int courseId, String coursename, int durationWeeks, boolean hasLiveSessions) {
        super(courseId, coursename, durationWeeks);
        this.hasLiveSessions = hasLiveSessions;
    }


    @Override
    public double calculatefee() {
        return 100*durationWeeks;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Has Live Session : "+(hasLiveSessions? "YES":"NO"));
        System.out.println("Total Fee : $"+calculatefee());
    }
}
