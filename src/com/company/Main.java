package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {
        // write your code here#ДЗ 3-й урок
        //3) (Дэдлайн 3 дня)
        //a) Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message,
        // double remainingAmount) и методом getRemainingAmount().
        //Сделано

        //b) Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() - возвращает текущий
        // остаток на счете, deposit(double sum) - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.
        //Сделано

        //c) Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше чем
        // остаток денег на счете.
        //Сделано

        //d) Написать Main класс где бы создавался счет клиента. Положить 20 000 сом на счет.
        //Сделано

        //e) Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом, при этом отлавливать исключение
        // LimitException и при возникновении такого исключения снимать только ту сумму, которая осталась на счете и завершать
        // бесконечный цикл
        //Сделано

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        double scannerDo = scanner.nextDouble();
        System.out.println("Введите начальный баланс на счету ");
        double scannerDo2 = scanner.nextDouble();
        System.out.println("Введите сумму которую хотите снять ");
        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.setAmount(scannerDo);
        boolean kukle = false;
        while (!kukle) {
            try {
                System.out.println(bankAccount1.getAmount());//Узнать счет
                System.out.println("_________");
                bankAccount1.withDraw((int) scannerDo2);
                System.out.println(bankAccount1.getAmount());
                if (bankAccount1.getAmount() == 0.0)
                    kukle = true;
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Произошел тротлинг");
                System.out.println(bankAccount1.getAmount());
                for (int i = 0; i < 2; i++) {
                    kukle = true;
                }
            }
        }
    }
}