package Week3Assignments.Asssignment4;



import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private static int idCounter = 0;  // Generates unique account IDs

    private final int id;              // Unique ID for each account
    private int balance;
    private final Lock lock = new ReentrantLock();  // Each account has its own lock

    public BankAccount(int balance) {
        this.balance = balance;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public Lock getLock() {
        return lock;
    }

    private void deposit(int amount) {
        balance += amount;
    }

    private void withdraw(int amount) {
        balance -= amount;
    }

    // Deadlock-free transfer method
    public static void transfer(BankAccount from, BankAccount to, int amount) {

        BankAccount firstLock = from;
        BankAccount secondLock = to;

        // Enforce consistent lock ordering using account ID
        if (from.getId() > to.getId()) {
            firstLock = to;
            secondLock = from;
        }

        firstLock.getLock().lock();
        try {
            secondLock.getLock().lock();
            try {
                if (from.getBalance() >= amount) {
                    from.withdraw(amount);
                    to.deposit(amount);

                    System.out.println(Thread.currentThread().getName()
                            + " transferred " + amount
                            + " from Account-" + from.getId()
                            + " to Account-" + to.getId());
                } else {
                    System.out.println("Insufficient balance in Account-" + from.getId());
                }
            } finally {
                secondLock.getLock().unlock();
            }
        } finally {
            firstLock.getLock().unlock();
        }
    }
}