package Tutorial.Tutorial_3_Q4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Book ID : ");
        String id=sc.nextLine();
        System.out.print("Enter Title : ");
        String tit=sc.nextLine();
        System.out.print("Enter price : ");
        double price=sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Quantity : ");
        int q=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name :");
        String name=sc.nextLine();
        System.out.print("Enter Nationality : ");
        String n=sc.nextLine();
        Book bk=new Book(id,tit,price,q,name,n);
        System.out.println( );

        bk.Displaydetails();
        System.out.println("IS Available : "+(bk.isAvailable(8)? "YES":"NO"));

    }
}
