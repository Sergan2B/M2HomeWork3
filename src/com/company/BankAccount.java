package com.company;

import java.util.Scanner;

public class BankAccount {
    double amount;

    public double deposit(double sum) throws LimitException { //deposit(double sum) - положить деньги на счет,
        setAmount(getAmount() + sum);
        return sum;
    }

    public int withDraw(int sum) throws LimitException { //withDraw(int sum) - снимает указанную сумму со счета. () Также метод withDraw() может
        // сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше чем остаток денег на счете.
        try {
            if (amount == 0) System.out.println("End");
            if (amount > sum) {
                setAmount(amount - sum);
            } else if (sum > amount) {
                int carol = (int) (sum - amount);
                amount = amount + carol;
                amount = amount - sum;
            }
        } catch (LimitException e) {
            e.printStackTrace();
            int carol = (int) (amount - sum);
            carol = (carol * 2) / 2;
            sum = sum - carol;
            setAmount(amount - sum);
        }
        return sum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws LimitException {
        if (amount > 100000) throw new LimitException("У вас не может быть много денег");
        this.amount = amount;
    }
}
