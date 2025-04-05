class Account {

private String accountType;

private double balance;

Account() {

accountType = "Default Account";

balance = 0.0;

}

Account(String accountType) {

this.accountType = accountType;

balance = 0.0;

}

Account(String accountType, double balance) {

this.accountType  = accountType;

this.balance = balance;

}

void displayDetails() {

System.out.println("Account Type: " + accountType);

System.out.println("Balance: $" + balance);

}

}

public class Amount {

public static void main(String[] args) {

Account defaultAccount = new Account();

defaultAccount.displayDetails();

Account savingsAccount = new Account("Savings Account");

savingsAccount.displayDetails();

Account premiumAccount = new Account("Premium Account", 1000.0);

premiumAccount.displayDetails();

}
}