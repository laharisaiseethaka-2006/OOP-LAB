class IceCream {
    String flavor;
    int scoops;

    IceCream() {
        flavor = "Vanilla";
        scoops = 1;
    }

    IceCream(String f) {
        flavor = f;
        scoops = 1;
    }

    IceCream(String f, int s) {
        flavor = f;
        scoops = s;
    }

    void display() {
        System.out.println("Flavor: " + flavor + ", Scoops: " + scoops);
    }
}

public class Food {
    public static void main(String[] args) {
        IceCream ice1 = new IceCream();
        ice1.display();

        IceCream ice2 = new IceCream("Chocolate");
        ice2.display();

        IceCream ice3 = new IceCream("Strawberry", 3);
        ice3.display();
    }
}