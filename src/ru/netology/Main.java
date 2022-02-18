package ru.netology;

public class Main {

    public static void main(String[] args) {

        Account[] accounts = new Account[3];
        accounts[0] = new CheckingAccount();
        accounts[1] = new SavingsAccount();
        accounts[2] = new CreditAccount();

        Account targetAccount = new SavingsAccount();

        for (Account account : accounts) {
            account.addMoney(400_00);
            account.pay(600_00);
            account.transfer(targetAccount, 300_00);
            account.addMoney(5000_00);
            account.transfer(targetAccount, 100_00);
            System.out.println();

        }
    }
}
