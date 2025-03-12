class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}


class Circle extends Shape {
    
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Art {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();  
    }
}
