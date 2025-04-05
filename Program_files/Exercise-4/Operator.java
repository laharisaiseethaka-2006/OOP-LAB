class Device {

void powerOn() {

System.out.println("Device is powered on.");

}

}

interface Printer {

void print();

}

class Computer extends Device implements Printer {

void process() {

System.out.println("Computer is processing tasks.");

}

public void print() {

System.out.println("Computer is printing documents.");

}

}

public class Operator {

public static void main(String[] args) {

Computer computer = new Computer();

computer.powerOn();

computer.process();

computer.print();

}

}