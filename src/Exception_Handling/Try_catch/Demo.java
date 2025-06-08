package Exception_Handling.Try_catch;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //System.out.print("Enter a number : ");
       // int i= sc.nextInt();

        try {
           // int j = 6 / i;
            String k=null;
           // System.out.println("Answer : " + j);
            System.out.println(k.length());

        }catch (ArithmeticException e){
            System.out.println("Arithmstic");
            System.out.println(e);

        }catch (NullPointerException e){
            System.out.println("Null pinter");

        }catch (Exception e){
            System.out.println("Error occurs");
        }
        finally {
            System.out.println("Inside the finally block");
        }


        System.out.println("Finish");
    }
}
