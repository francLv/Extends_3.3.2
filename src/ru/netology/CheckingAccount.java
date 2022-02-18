package ru.netology;

public class CheckingAccount extends Account {

    @Override
    public boolean pay(int amount) {
        if (money < amount) {
            noMoney();
            return false;
        } else {
            money -= amount;
            System.out.println("Выполнен платеж с расчетного счета на сумму " + amount / 100 + " рублей");
            balance();
            return true;
        }
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (money < amount) {
            noMoney();
            return false;
        } else if (account.addMoney(amount)) {
            money -= amount;
            System.out.println("Выполнен перевод с расчетного счета на сумму " + amount / 100 + " рублей");
            balance();
            return true;
        }
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        money += amount;
        System.out.println("Расчетный счет пополнен на сумму " + amount / 100 + " рублей");
        balance();
        return true;
    }
}

