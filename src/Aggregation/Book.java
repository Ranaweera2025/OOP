package Aggregation;

public class Book {
    private String Name;
    private String Author;

    public Book(String BName,String BAuthor){
        this.Name=BName;
        this.Author=BAuthor;
    }

    public void displayBookdetails(){
        System.out.print("Book Name :"+Name+"  ----------->");
        System.out.print("   Book Author :"+Author);
        System.out.println();
    }
}
