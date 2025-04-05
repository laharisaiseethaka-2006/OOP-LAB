abstract class PaymentMethod {
    public abstract void processPayment(double amount);
}
class CreditCardPayment extends PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
class PayPalPayment extends PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
class BitcoinPayment extends PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

public class Pay {
    public static void main(String[] args) {
        PaymentMethod creditCard = new CreditCardPayment();
        PaymentMethod payPal = new PayPalPayment();
        PaymentMethod bitcoin = new BitcoinPayment();

        creditCard.processPayment(100.0);
        payPal.processPayment(250.5);
        bitcoin.processPayment(450.75);
    }
}
