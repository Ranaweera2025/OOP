package Que_6;

public class Book {
    protected String Title;
    protected String Author;
    protected int pagecount;

    public Book() {
        this.Title="";
        this.Author="";
        this.pagecount=0;

    }

    public Book(String title, String author, int pagecount) {
        Title = title;
        Author = author;
        this.pagecount = pagecount;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPagecount() {
        return pagecount;
    }

    public void setPagecount(int pagecount) {
        this.pagecount = pagecount;
    }

    public boolean isshortbook(){
        return pagecount<200;
    }


    public void  print(){
        System.out.println("Title : "+Title);
        System.out.println("author : "+Author);
        System.out.println("Page Count : "+pagecount);
        System.out.println("Book is a "+(isshortbook()? "short book":"not a short book"));
    }
}
