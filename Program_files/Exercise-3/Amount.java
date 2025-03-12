class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

   
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }
}

public class Amount {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(5000);
        account.displayBalance();  
    }
}