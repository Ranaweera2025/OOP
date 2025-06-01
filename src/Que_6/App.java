package Que_6;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book[] books=new Book[2];

        for(int i=0;i<2;i++){
            System.out.println("Enter Book "+(i+1)+" details ");
            System.out.print("Enter Title : ");
            String Title=sc.nextLine();
            System.out.print("Enter Author : ");
            String Author=sc.nextLine();
            System.out.print("Page cont : ");
            int count=sc.nextInt();
            sc.nextLine();
            System.out.println();

            books[i]=new Book(Title,Author,count);

        }

        System.out.println("Printing");

        for(int i=0;i<2;i++){
            books[i].print();
            System.out.println();
        }
    }
}
