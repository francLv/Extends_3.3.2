package ru.netology;

public class SavingsAccount extends Account {

    @Override
    public boolean pay(int amount) {
        System.out.println("Платеж со сберегательного счета невозможен");
        return false;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (money < amount) {
            noMoney();
            return false;
        } else if (account.addMoney(amount)) {
            money -= amount;
            System.out.println("Выполнен перевод со " + account.getClass().getSimpleName() + " на сумму " + amount / 100 + " рублей");
            balance();
            return true;
        }
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        money += amount;
        System.out.println("Сберегательный счет пополнен на сумму " + amount / 100 + " рублей");
        balance();
        return true;
    }
}