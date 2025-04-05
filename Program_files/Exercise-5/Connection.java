class Network {

Network() {

System.out.println("Initializing network...");

}

}

class WiredNetwork extends Network {

WiredNetwork() {

super(); // Calls the Network constructor

System.out.println("Wired Network is set up.");

}

}

class WirelessNetwork extends Network {

WirelessNetwork() {

super(); // Calls the Network constructor

System.out.println("Wireless Network is set up.");

}

}

public class Connection {

public static void main(String[] args) {

WiredNetwork wired = new WiredNetwork();

WirelessNetwork wireless = new WirelessNetwork();

}

}