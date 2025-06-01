package Que_4;

public class TemperatureConverter {

    protected double temp;

    public TemperatureConverter() {
        this.temp=0;
    }

    public double getTemp(){
        return temp;
    }

    public double celsiusToFahrenheit(double celsius){
        this.temp=celsius;
        return (celsius * 9/5) + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        this.temp = fahrenheit;
        return (fahrenheit - 32) * 5/9;
    }
}
