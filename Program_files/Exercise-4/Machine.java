class Appliance {

void switchon() {

System.out.println("Appliance is switched on.");

}

}

interface Dryer {

void dryClothes();

}

class WashingMachine extends Appliance implements Dryer {

void washClothes() {

System.out.println("Washing machine is washing clothes.");

}

public void dryClothes() {

System.out.println("Washing machine is drying clothes.");

}

}

public class Machine {

public static void main(String[] args) {

WashingMachine machine =  new WashingMachine();

machine.switchon();

machine.washClothes();

machine.dryClothes();

}

}