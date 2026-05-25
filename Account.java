public class Account {
    // Instance variables
    private final String id;
    private final String name;
    private int balance = 0;

    // Constructor with id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with id, name, and balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // Credit method
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Debit method
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer method
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // toString method
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}