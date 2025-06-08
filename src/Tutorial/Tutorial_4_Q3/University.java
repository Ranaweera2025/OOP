package Tutorial.Tutorial_4_Q3;

public class University {
    private String uniname;
    private Professor professor;

    public University(String uniname, Professor professor) {
        this.uniname = uniname;
        this.professor = professor;
    }
    public void dispalydetails(){
        System.out.println("Uni Name : "+uniname);
        professor.displayprofessor();
    }
}
