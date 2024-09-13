import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte myByte = -7;
        short myShort = 30_000;
        int myInt = 3_000_000;
        long myLong = 6_000_000_000L;
        float myFloat = 1.56f;
        double myDouble = 3.44;
        char myChar = 'T';
        boolean myBoolean = true;


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
        System.out.println("ПЕРЕПОЛНЕНИЕ");

        long mySecondLong = 3_000_000_000L;
        System.out.println("mySecondLong: " + mySecondLong);
        int mySecondInt = (int) mySecondLong;
        System.out.println("mySecondInt: " + mySecondInt);







    }
}