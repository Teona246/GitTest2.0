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


        int x = 39;
        int z = 9;

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

    }
}