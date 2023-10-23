public class Account {
    int balance;

    public Account(int balance) {
        this.balance = this.balance;
    }

    public void withdraw(int n) {
        balance -= n;
        if (n > balance) balance = 0;
    }

    public void put(int n) {
        balance += n;
    }

    public int checkBalance() {
        return balance;
    }
}

