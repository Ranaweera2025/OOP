package Interface.Lab9;

public class Report implements Printable{

    private String title;
    private String author;

    public Report(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void diplay() {
        System.out.println("Printing book details-------------");
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
    }
}
