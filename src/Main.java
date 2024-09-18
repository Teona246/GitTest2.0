import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 //       task1();
 //       task2();
 //       task3();
 //       task4();
        task5();
    }

    static void task1() {
        byte myByte = -7;
        short myShort = 30_000;
        int myInt = 3_000_000;
        long myLong = 6_000_000_000L;
        float myFloat = 1.56f;
        double myDouble = 3.44;
        char myChar = 'T';
        boolean myBoolean = true;
        System.out.println(" ");
    }
    static void task2() {
        Scanner scan = new Scanner (System.in);
        System.out.println("Введите число: ");
        int x = scan.nextInt();

        System.out.println("Введите число: ");
        int z = scan.nextInt();

        int sum = x+z;
        int difference = x-z;
        int product = x*z;
        int quotient = x/z;
        int remainder = x%z;

        System.out.println("Сложение: " + sum);
        System.out.println("Вычитание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Остаток от деления: " + remainder);

        System.out.println();
    }
    static void task3() {
        System.out.println("РАНДОМ");

        Random random = new Random();
        int firstNum = random.nextInt(0,65535);
        int secondNum = random.nextInt(0,65535);
        int thirdNum = random.nextInt(0,65535);
        int fourthNum = random.nextInt(0,65535);

        char char1 = (char) firstNum;
        char char2 = (char) secondNum;
        char char3 = (char) thirdNum;
        char char4 = (char) fourthNum;

        System.out.println("Символы: " + char1 + char2 + char3 + char4);

        System.out.println();
    }
    static void task4 () {
        System.out.println("ПЕРЕПОЛНЕНИЕ");

        long mySecondLong = 3_000_000_000L;
        System.out.println("mySecondLong: " + mySecondLong);
        int mySecondInt = (int) mySecondLong;
        System.out.println("mySecondInt: " + mySecondInt);
        System.out.println("");
    }
    static void task5() {
        for (int coffee = 1; coffee <= 8; coffee++ ) {
            if (coffee == 8) {
                System.out.println("В холдере " + coffee + "г," + " можно вставлять в кофемашину");
            } else if (coffee != 8) {
                System.out.println(" Идет посыпка кофе в холдер: " + coffee);
            }
        } System.out.println(" Идет пролив кофе...");
        int ex = 21;
        for (ex = 1; ex <= 20;) {
            System.out.println(ex);
            ex++;
            boolean coffeeIsReady = (ex == 21);
            boolean coffeeIsNotReady = (ex != 21);
            if (coffeeIsReady) {
                System.out.println("Кофе готов");
                if (coffeeIsNotReady) {
                    System.out.println("Кофе не готов");
                }
        }
        }
    }
}