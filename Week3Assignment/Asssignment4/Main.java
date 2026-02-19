package Week3Assignments.Asssignment4;




public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(3000);
        BankAccount account2 = new BankAccount(2000);

        Runnable task1 = () ->
                BankAccount.transfer(account1, account2, 500);

        Runnable task2 = () ->
                BankAccount.transfer(account2, account1, 300);

        Thread t1 = new Thread(task1, "Thread-1");
        Thread t2 = new Thread(task2, "Thread-2");

        t1.start();
        t2.start();
    }
}



