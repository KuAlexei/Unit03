package com.epam.ld.javabasics30.unit03.skils.consolidation;

import java.util.Scanner;

public class Task01 {

    private static final String TABLE_TOP = "\u2554\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2566\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2557";
    private static final String TABLE_MIDDLE = "\u2560\u2550\u2550\u2550\u2550\u2550\u256C\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u256C\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2563";
    private static final String TABLE_BOTTOM = "\u255A\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2569\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u255D";
    private static final String LINE_FORMAT = "\u2551 %3s \u2551 %5.4g \u2551 %5.4g \u2551\n";

    private static final double[] USD = {2.2342, 2.3452};
    private static final double[] EUR = {2.6345, 2.7345};

    public static void main(String[] args) {
        System.out.println("       Покупка Продажа");
        System.out.println(TABLE_TOP);
        System.out.printf(LINE_FORMAT, "USD", USD[0], USD[1]);
        System.out.println(TABLE_MIDDLE);
        System.out.printf(LINE_FORMAT, "EUR", EUR[0], EUR[1]);
        System.out.println(TABLE_BOTTOM);
        boolean operation; // TRUE - Покупка, FALSE - Продажа
        Scanner sc = new Scanner(System.in);
        String s="";
        while (true) {
            System.out.println();
            System.out.println("1. Купить");
            System.out.println("2. Продать");
            System.out.println("3. Выход");
            s = sc.nextLine();
            if (operation = "1".equals(s)) {
                break;
            } else if ("2".equals(s)) {
                break;
            } else if ("3".equals(s)) {
                return;
            } else System.out.print("Повторите ввод.");
        }
        String currencyName = "";
        double[] currency;
        while (true) {
            System.out.println();
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. Выход");
            s = sc.nextLine();
            if ("1".equals(s)) {
                currencyName = "USD";
                currency=USD;
                break;
            } else if ("2".equals(s)) {
                currencyName = "EUR";
                currency=EUR;
                break;
            } else if ("3".equals(s)) {
                return;
            } else System.out.print("Повторите ввод.");
        }
        System.out.println("Сколько " + currencyName + " желаете " + (operation?"купить":"продать") + ": ");
        if (sc.hasNextDouble()) {
            double amount = sc.nextDouble();
            if (operation) {
                System.out.println("BYN -> " + currencyName + " : " + currency[1]*amount);
            } else {
                System.out.println(currencyName + " -> BYN : " + currency[0]*amount);
            }
        }
    }
}
// Отлично. Задачи модуля 3 защитаны
