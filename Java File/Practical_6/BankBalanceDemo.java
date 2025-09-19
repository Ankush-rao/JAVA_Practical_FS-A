package Practical_6;

abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int getBalance() { return 100; }
}
class BankB extends Bank {
    int getBalance() { return 150; }
}
class BankC extends Bank {
    int getBalance() { return 200; }
}

public class BankBalanceDemo {
    public static void main(String[] args) {
        Bank a = new BankA();
        Bank b = new BankB();
        Bank c = new BankC();

        System.out.println("Bank A balance: $" + a.getBalance());
        System.out.println("Bank B balance: $" + b.getBalance());
        System.out.println("Bank C balance: $" + c.getBalance());
    }
}
