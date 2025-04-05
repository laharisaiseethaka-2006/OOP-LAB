class Car {
    private int speed;
    public Car() {
        speed = 0; 
    }
    public int getSpeed() {
        return speed;
    }
    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;
        } else {
            System.out.println("Speed increment must be positive.");
        }
    }
    public void decelerate(int decrement) {
        if (decrement > 0 && speed - decrement >= 0) {
            speed -= decrement;
        } else {
            System.out.println("Invalid deceleration value.");
        }
    }
}
public class Motor {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Initial Speed: " + car.getSpeed() + " km/h");
        car.accelerate(50);
        System.out.println("Speed after accelerating: " + car.getSpeed() + " km/h");
        car.decelerate(20);
        System.out.println("Speed after decelerating: " + car.getSpeed() + " km/h");
        car.decelerate(50);
    }
}
