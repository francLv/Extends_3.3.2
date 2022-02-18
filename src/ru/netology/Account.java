package ru.netology;

public abstract class Account {

    protected int money;

    public abstract boolean pay(int amount);

    public abstract boolean transfer(Account account, int amount);

    public abstract boolean addMoney(int amount);

    public void noMoney() {
        System.out.println("Недостаточно среств для операции");
    }

    public void balance() {
        System.out.println("Баланс счета: " + money / 100 + " руб.");
    }

}
