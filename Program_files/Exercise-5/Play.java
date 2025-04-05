class Game {

Game() {

System.out.println("A new game is starting...");

}

}

class Chess extends Game {

Chess() {

super();

System.out.println("Chess game is ready.");

}

}

class Puzzle extends Game {

Puzzle() {

super(); // Calls the Game constructor

System.out.println("Puzzle game is ready.");

}

}

public class Play {

public static void main(String[] args) {

Chess chess = new Chess();

Puzzle puzzle = new Puzzle();

}

}