package ru.netology;

public class CreditAccount extends Account {

    @Override
    public boolean pay(int amount) {
        money -= amount;
        System.out.println("Выполнен платеж с кредитного счета на сумму " + amount / 100 + " рублей");
        balance();
        return true;
    }

    @Override
    public boolean transfer(Account account, int amount) {
        if (account.addMoney(amount)) {
            money -= amount;
            System.out.println("Выполнен перевод с кредитного счта на сумму "
                    + amount / 100 + " рублей");
            balance();
            return true;
        }
        return false;
    }

    @Override
    public boolean addMoney(int amount) {
        if (money + amount > 0) {
            System.out.println("Нельзя пополнить кредитный счет на сумму, превышающую сумму кредита");
            return false;
        }
        money += amount;
        System.out.println("Счет пополнен на сумму " + amount / 100 + " рублей");
        balance();
        return true;
    }
}


