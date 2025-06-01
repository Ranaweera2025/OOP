package Aggregation;

public class Librabr {
    private String libname;
    private Book book1;
    private Book book2;

    public Librabr(String libname,Book book1,Book book2){
        this.libname=libname;
        this.book1=book1;
        this.book2=book2;
    }

    public void display(){
        System.out.println("Library Name :"+libname);
        book1.displayBookdetails();
        book2.displayBookdetails();
    }
}
