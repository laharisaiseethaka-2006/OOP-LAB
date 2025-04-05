abstract class Shape {
    public double getArea() {
        return 0.0;  // Default area
    }
    public abstract void draw();
}

interface Colorable {
    void color(String color);
}
class Circle extends Shape implements Colorable {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
    public double getArea() {
        return Math.PI * radius * radius;  // Area of the circle
    }
    public void color(String color) {
        System.out.println("Coloring the circle with color: " + color);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Shape myShape = new Circle(5.0);
        myShape.draw(); 
        System.out.println("Area: " + myShape.getArea());  
        Colorable colorableShape = (Colorable) myShape;
        colorableShape.color("Red"); 
    }
}
