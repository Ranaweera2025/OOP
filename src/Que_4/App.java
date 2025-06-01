package Que_4;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        TemperatureConverter cel=new TemperatureConverter();
        TemperatureConverter far=new TemperatureConverter();

        System.out.print("Enter temp in celsius : ");
        double celsius= sc.nextDouble();
        double x=cel.celsiusToFahrenheit(celsius);


        System.out.print("Enter temp in Faranhid : ");
        double faranhid=sc.nextDouble();
        double y=far.fahrenheitToCelsius(faranhid);


        System.out.println(celsius+" equal to "+x+" Faranhid");
        System.out.println(faranhid+" equal to "+y+" celsius");
    }
}
