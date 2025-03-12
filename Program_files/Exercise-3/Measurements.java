class Room {
   
    double length, width;

  
    public Room(double length, double width) {
        this.length = length;
        this.width = width;
    }

    
    public double calculateArea() {
        return length * width;
    }
}


class RoomWithHeight extends Room {

    double height;

   
    public RoomWithHeight(double length, double width, double height) {
        super(length, width); // Call the parent class constructor
        this.height = height;
    }

    
    public double calculateVolume() {
        return calculateArea() * height;
    }
}

public class Measurements {
    public static void main(String[] args) {
        
        RoomWithHeight room = new RoomWithHeight(5, 4, 3);
        
        
        double area = room.calculateArea();
        System.out.println("Room Area: " + area + " square meters");

      
        double volume = room.calculateVolume();
        System.out.println("Room Volume: " + volume + " cubic meters");
    }
}