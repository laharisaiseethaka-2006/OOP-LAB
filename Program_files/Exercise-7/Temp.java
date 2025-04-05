class Temperature {
    private double temperatureInCelsius;
    public Temperature(double temperatureInCelsius) {
        this.temperatureInCelsius = temperatureInCelsius;
    }
    public double getTemperatureInCelsius() {
        return temperatureInCelsius;
    }
    public double toFahrenheit() {
        return (temperatureInCelsius * 9/5) + 32;
    }
    public double toKelvin() {
        return temperatureInCelsius + 273.15;
    }
}
public class Temp {
    public static void main(String[] args) {
        Temperature temp = new Temperature(25);
        System.out.println("Temperature in Celsius: " + temp.getTemperatureInCelsius());
        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());
        System.out.println("Temperature in Kelvin: " + temp.toKelvin());
    }
}
