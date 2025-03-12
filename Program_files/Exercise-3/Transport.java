class Vehicle {
    public void type() {
        System.out.println("This is a vehicle");
    }
}
class Car extends Vehicle {
    public void type() {
        System.out.println("This is a car");
    }
}

public class Transport {
    public static void main(String[] args) {
        Car car = new Car();
        car.type();  
    }
}
