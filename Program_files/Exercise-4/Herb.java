class Plant {

void grow() {

System.out.println("Plants grow.");

}

}

class Flower extends Plant {

void bloom() {

System.out.println("Flowers bloom beautifully.");

}

}

class Rose extends Flower {

void smell() {

System.out.println("Roses have a pleasant fragrance.");

}

}

public class Herb {

public static void main(String[] args) {

Rose rose = new Rose();

rose.grow();

rose.bloom();

rose.smell();

}

}