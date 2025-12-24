package workshop7.Scenario;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("ACC001", "Sampurna Odari", 1000.0);
        BankAccount account2 = new BankAccount("ACC002", "Reehana Shrestha", 2000.0);

        System.out.println("Initial Balances:");
        account1.displayBalance();
        account2.displayBalance();

        System.out.println("Performing transactions on Account 1:");
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println();

        System.out.println("Performing transactions on Account 2:");
        account2.deposit(300.0);
        account2.withdraw(100.0);
        System.out.println();

        System.out.println("Final Balances:");
        account1.displayBalance();
        account2.displayBalance();
    }
}
