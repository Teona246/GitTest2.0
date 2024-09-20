import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 //       task1();
 //       task2();
 //       task3();
 //       task4();
 //       task5();
        task6();
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
        System.out.println("");
    }
    static void task6() {
        System.out.println("Задание 1: ");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int ageNumber = sc.nextInt();
        boolean age = (ageNumber <=24);
        String message;
        if (age) {
            message = switch (ageNumber) {
                case 2, 4, 5, 6 -> "Должен ходить в детский сад";
                case 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 -> "Должен ходить в школу";
                case 19, 20, 21, 22, 23, 24 -> "Должен ходить в университет";
                default -> "Не можем подобрать учреждение";
            };
            System.out.println(message);
        } else if (ageNumber > 25) {
            System.out.println("Пора на работу");
        }
        System.out.println();
        System.out.println("Задание 2: ");
        System.out.println();

        System.out.println("Текущая зарплата сотрудников:");

        String name1 = ("Диана");
        String name2 = ("Андрей");
        String name3 = ("Мария");

        int salary1 = 66660;
        System.out.println(name1 + " получает: " + salary1);
        int salary2 = 77770;
        System.out.println(name2 + " получает: " + salary2);
        int salary3 = 88880;
        System.out.println(name3 + " получает: " + salary3);

        //Годовой доход

        int salaryYear1 = (salary1 * 12);
        int salaryYear2 = (salary2 * 12);
        int salaryYear3 = (salary3 * 12);

        //Зарплата после индексации

        int salaryUp1 = ((salary1 * 115) / 100);
        int salaryUp2 = ((salary2 * 115) / 100);
        int salaryUp3 = ((salary3 * 115) / 100);

        int salaryUpYear1 = (salaryUp1 * 12);
        int salaryUpYear2 = (salaryUp2 * 12);
        int salaryUpYear3 = (salaryUp3 * 12);

        //Разница между текущим и будущим годовым доходом
        int difference1 = (salaryUpYear1 - salaryYear1);
        int difference2 = (salaryUpYear2 - salaryYear2);
        int difference3 = (salaryUpYear3 - salaryYear3);

        System.out.println(name1 + " теперь получает " + salaryUp1 + ". " + "Годовой доход вырос на: " + difference1);
        System.out.println(name2 + " теперь получает " + salaryUp2 + ". " + "Годовой доход вырос на: " + difference2);
        System.out.println(name3 + " теперь получает " + salaryUp3 + ". " + "Годовой доход вырос на: " + difference3);
        System.out.println();
        System.out.println("Задание 3: ");
        System.out.println();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Input month number: ");
        int monthNumber = sc1.nextInt();
        String month = switch (monthNumber) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> "Неправильное значение";
        };
        System.out.println(month);

    }

    }