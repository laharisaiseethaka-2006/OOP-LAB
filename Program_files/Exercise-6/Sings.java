abstract class Operation {

abstract void performOperation();

}

interface Result {

void displayResult();

}

class Addition extends Operation implements Result {

private int a, b, sum;

Addition(int a, int b) {

this.a = a;

this.b = b;

}

void performOperation() {

sum = a + b;

}

public void displayResult() {

System.out.println("Addition Result:" + sum);

}

}

public class Sings {

public static void main(String[] args) {

Addition addition = new Addition (10, 20);

addition.performOperation();

addition.displayResult();

}
}