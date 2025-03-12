class BankAccount {
    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayBalance() {
        System.out.println("Bank Account Balance: " + balance);
    }
}


class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    public void displayBalance() {
        System.out.println("Checking Account Balance: " + balance);
    }
}

public class Account {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1000);
        account.deposit(500);
        account.displayBalance();  
    }
}