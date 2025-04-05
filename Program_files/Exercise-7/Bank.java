class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Invalid initial balance.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);

        account.deposit(200);
        System.out.println("Balance after deposit: $" + account.getBalance());

        account.withdraw(150);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        account.withdraw(600); 
    }
}
