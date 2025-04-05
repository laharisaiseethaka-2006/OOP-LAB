abstract class Device {
    public abstract double powerConsumption();
}
class Laptop extends Device {
    private double powerPerHour;

    public Laptop(double powerPerHour) {
        this.powerPerHour = powerPerHour;
    }
    public double powerConsumption() {
        return powerPerHour * 24; 
    }
}
class Refrigerator extends Device {
    private double powerPerHour;

    public Refrigerator(double powerPerHour) {
        this.powerPerHour = powerPerHour;
    }
    public double powerConsumption() {
        return powerPerHour * 24 * 30; 
    }
}

public class Tool {
    public static void main(String[] args) {
        Device laptop = new Laptop(0.5); 
        Device fridge = new Refrigerator(1.2); 
        
        System.out.println("Laptop power consumption in a day: " + laptop.powerConsumption() + " kWh");
        System.out.println("Fridge power consumption in a month: " + fridge.powerConsumption() + " kWh");
    }
}
