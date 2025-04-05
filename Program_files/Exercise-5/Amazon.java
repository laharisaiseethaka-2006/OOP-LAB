class Order {

private int orderId;

private String itemName;

private int quantity;

Order() {

orderId =  0;

itemName = "Unknown Item";

quantity  = 0;

}

Order(int orderId) {

this.orderId = orderId;

itemName = "Unknown Item";

quantity  = 0;

} Order(int orderId, String itemName) {

this.orderId = orderId;

this.itemName = itemName;

quantity = 0;

}

Order(int orderId, String itemName, int quantity) {

this.orderId = orderId;

this.itemName = itemName;

this.quantity = quantity;

}

void displayOrderDetails() {

System.out.println("Order ID:" +orderId);

System.out.println("Item Name:" +itemName);

System.out.println("Quantity:" + quantity);

}

}

public class Amazon{

public static void main(String[] args) {

Order defaultOrder = new Order();

defaultOrder.displayOrderDetails();

Order singleOrder = new Order(101);

singleOrder.displayOrderDetails();

Order itemOrder = new Order(102, "Laptop");

itemOrder.displayOrderDetails();

Order fullOrder= new Order(103, "Smartphone", 2);

fullOrder.displayOrderDetails();

}
}