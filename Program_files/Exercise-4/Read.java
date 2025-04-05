class Book {

void read() {

System.out.println("Books are read for knowledge or entertainment.");

}

}

class Fiction extends Book {

void imagination() {

System.out.println("Fiction sparks imagination.");

}

}

class Novel extends Fiction {

void pages() {

System.out.println("Novels often have hundreds of pages.");

}

}

public class Read {

public static void main(String[] args) {

Novel novel = new Novel();

novel.read();

novel.imagination();

novel.pages();

}

}