package com.epam.ld.javabasics30.unit03.skils.formation;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Проверим знание таблицы умножения.");
        Random rnd  = new Random();
        int a = rnd.nextInt(10);
        int b = rnd.nextInt(10);
        System.out.printf("Сколько будет %dx%d? ", a, b);
        int answer=0;
        if (sc.hasNextInt()) {
            answer = sc.nextInt();
            if (answer == a*b) {
                System.out.println("Правильно!");
            } else {
                System.out.println("Неправильно!");
            }
        }
    }
}
