public class TestAccount {
    public static void main(String[] args) {

        // Create two accounts
        Account acc1 = new Account("A101", "Sam", 5000);
        Account acc2 = new Account("A102", "John", 4000);

        // Display original balances
        System.out.println("Before Transfer:");
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // Display balances after transfer
        System.out.println("\nAfter Transfer:");
        System.out.println("Account 1 Balance: $" + acc1.getBalance());
        System.out.println("Account 2 Balance: $" + acc2.getBalance());
    }
}