package Exception_Handling.Try_catch;

public class Throw {

    static void validate(int age){
        if (age<18){
            throw new ArithmeticException("Not allowed to vote");
        }
        else {
            System.out.println("Allowed");
        }
    }

    public static void main(String[] args) {
        try {
            validate(13);
        }
        catch (ArithmeticException e){
            System.out.println("Error Occures");
        }
    }
}
