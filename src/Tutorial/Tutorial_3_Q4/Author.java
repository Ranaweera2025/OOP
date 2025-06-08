package Tutorial.Tutorial_3_Q4;

public class Author {

    protected String name;
    protected String nationality;

    public Author() {
        this.name="";
        this.nationality="";

    }

    public Author(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }


    public void Display(){
        System.out.println("Author Name : "+name);
        System.out.println("Nationality : "+nationality);
    }
}
