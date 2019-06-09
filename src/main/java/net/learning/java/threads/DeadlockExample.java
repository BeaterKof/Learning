package net.learning.java.threads;

public class DeadlockExample {

    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account(40);
        Account acc2 = new Account(10);

        Thread t1 = new Transaction(acc1, acc2, 10);
        Thread t2 = new Transaction(acc2, acc1, 20);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(acc1);
        System.out.println(acc2);
    }
}

class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}

class Transaction extends Thread {
    private final Account from;
    private final Account to;
    private final double amount;

    public Transaction(Account from, Account to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    void transfer(Account from, Account to, double amount) {
        synchronized(from) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (to) {
                from.withdraw(amount);
                to.deposit(amount);
            }
        }
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }
}