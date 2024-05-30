package de.telran.myNewsGroup.module6.homeWork2;

public class BankAccountSimple {
    /**
     * Имеется счет BankAccount, на котором хранится определенная сумма денег int sum.
     * Реализовать потокобезопасный метод пополнения счета - deposit(int amount), снятия со счета - withdraw(int amount).
     */

    public static void main(String[] args) {
        BankAccountSimple account = new BankAccountSimple(1000);

        Thread transact1 = new Thread(() -> {
            account.deposit(300);
            account.withdraw(500);
        });
        Thread transact2 = new Thread(() -> {
            account.deposit(600);
            account.withdraw(200);
        });
        Thread transact3 = new Thread(() -> {
            account.deposit(900);
            account.withdraw(400);
        });

        transact1.start();
        transact2.start();
        transact3.start();

        try {
            transact1.join();
            transact2.join();
            transact3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Balance is: " + account.getSum());
    }

        private int sum;

    public BankAccountSimple(int sum) {
        this.sum = sum;
    }

    public synchronized void deposit(int amount) {
        if (amount > 0) {
            sum += amount;
            System.out.println("Deposit " + amount + ", new balance: " + sum);
        } else {
            System.out.println("incorrect sum: " + amount);
        }
    }

    public synchronized void withdraw(int amount) {
        if (amount > 0 && amount <= sum) {
            sum = sum - amount;
            System.out.println("Withdrew " + amount + ", new balance: " + sum);

        } else if (amount > sum) {
            System.out.println("Insufficient funds");

        } else {
            System.out.println("Incorrect operation");
        }
    }
    public int getSum() {
        return sum;
    }
}

