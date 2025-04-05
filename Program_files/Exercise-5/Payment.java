class PaymentSystem {

PaymentSystem() {

System.out.println("Initializing payment system...");

}

}

class CreditCardPayment extends PaymentSystem {

CreditCardPayment() {

super(); // Calls the Payment System constructor

System.out.println("Credit Card Payment is being processed.");

}

}

class PayPalPayment extends PaymentSystem {

PayPalPayment() {

super(); // Calls the Payment System constructor

System.out.println("PayPal Payment is being processed.");

}

}

public class Payment {

public static void main(String[] args) {

CreditCardPayment creditCard = new CreditCardPayment();

PayPalPayment payPal = new PayPalPayment();

}

}