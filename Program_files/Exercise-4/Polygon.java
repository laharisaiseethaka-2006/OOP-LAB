class Shape {

void describe() {

System.out.println("This is a shape.");

}

}

class Rectangle extends Shape {

void area() {

System.out.println("Area of rectangle length x breadth");

}

}

class Circle extends Shape {

void area() {

System.out.println("Area of circle = xrxr");

}

}

public class Polygon {

public static void main(String[] args) {

Rectangle rectangle = new Rectangle();

rectangle.describe();

rectangle.area();

Circle circle = new Circle();

circle.describe();

circle.area();

}

}