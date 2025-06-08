package Tutorial.Tutorial_4_Q3;

public class Professor {
     private String name;
     private String subject;

    public Professor(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void displayprofessor (){
        System.out.println("Professor Name : "+name);
        System.out.println("Subject : "+ subject);
    }
}
