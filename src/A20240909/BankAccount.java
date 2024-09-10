package A20240909;

public class BankAccount {
    private int balance = 100;

    // 同步方法確保每次只有一個執行緒可以取錢
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " 正在取款: " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " 取款後餘額: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " 餘額不足，無法取款");
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable task = () -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(30);  // 每個執行緒嘗試取 30 元
            }
        };

        Thread thread1 = new Thread(task, "執行緒 1");
        Thread thread2 = new Thread(task, "執行緒 2");

        thread1.start();
        thread2.start();
    }
}