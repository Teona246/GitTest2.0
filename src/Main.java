import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        //Задача 1. Вывод чётных чисел от 1 до n
        //Условие: Напишите программу, которая выводит все НЕчётные числа от 1 до заданного числа n.
        //Пример: Для n = 10 программа должна вывести: 1 3 5 7 9
        System.out.println();
        System.out.println("Вывод нечетных чисел");
        System.out.println();

        int n = 33;
        for (int i = 0; i <= 33; i++) {
            if (i == 0) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println();
    }

    static void task2() {
        //Задача 2. Произведение чисел от 1 до n
        //Условие: Напишите программу, которая вычисляет произведение всех чисел от 1 до заданного числа n
        //Пример: Для n = 4, результат будет 1 * 2 * 3 * 4 = 24.
        System.out.println("Произведение чисел");
        System.out.println();

        int n = 18;
        long product = 1;
        for (int i = 1; i <= 18; i++) {
            product *= i;
        }
        System.out.println(product);
        System.out.println();

    }

    static void task3() {
        // Задача 3. Таблица умножения
        // Условие: Напишите программу, которая выводит таблицу умножения от 1 до 10 (1 * 1, 1* 2 и т.д. до 10 * 10)
        // Использовать вложенные циклы for.
        System.out.println("Таблица умножения");
        System.out.println();

        int n = 10;
        int product;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                product = i * j;
                System.out.println(i + " * " + j + " = " + product);
            }


        }
    }

}


