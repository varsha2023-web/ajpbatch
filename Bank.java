package lab03;

public class Bank {
    double amount;

    // Constructor
    Bank(double amount) {
        this.amount = amount;
    }

    // Withdraw method
    void withdraw(double withdrawalAmount) {
        String message = (withdrawalAmount <= amount) 
                ? "Withdrawal successful" 
                : "Insufficient balance";

        System.out.println("Withdrawal amount = " + withdrawalAmount);
        System.out.println(message);

        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
    }

    // Deposit method
    void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit amount = " + depositAmount);
    }

    // Main method
    public static void main(String[] args) {
        Bank b = new Bank(10000);

        b.withdraw(5000);
        b.deposit(5000);

        System.out.println("Final Balance = " + b.amount);
    }
}