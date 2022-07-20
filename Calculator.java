import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Сложение");
            System.out.println("2. Вычитание");
            System.out.println("3. Деление");
            System.out.println("4. Умножение");
            System.out.println("5. Факториал");
            System.out.println("6. Я ошибся, хочу выйти :(");

            int choise = sc.nextInt();
            double result;
            if (choise == 6) {
                System.out.println("До свидания!");
                break;
            }
            if (choise == 1) {
                System.out.println("Вы выбрали операцию - сложение.");
                System.out.print("Введите число: ");
                double num1 = sc.nextInt();
                System.out.print("Введите число: ");
                double num2 = sc.nextInt();
                result = num1 + num2;
                System.out.println("Ответ: " +num1 + " + " + num2+ " = " + result );
            }
            if (choise == 2) {
                System.out.println("Вы выбрали операцию - вычитание.");
                System.out.print("Введите число: ");
                double num1 = sc.nextInt();
                System.out.print("Введите число: ");
                double num2 = sc.nextInt();
                result = num1 - num2;
                System.out.println("Ответ: " + num1 + " - " + num2+ " = " + result );
            }
            if (choise == 3) {
                System.out.println("Вы выбрали операцию - деление.");
                System.out.print("Введите число: ");
                double num1 = sc.nextInt();
                System.out.print("Введите число: ");
                double num2 = sc.nextInt();
                result = num1 / num2;
                System.out.println("Ответ: " + num1 + " / " + num2+ " = " + result );
            }
            if (choise == 4) {
                System.out.println("Вы выбрали операцию - умножение.");
                System.out.print("Введите число: ");
                double num1 = sc.nextInt();
                System.out.print("Введите число: ");
                double num2 = sc.nextInt();
                result = num1 * num2;
                System.out.println("Ответ: " + num1 + " * " + num2+ " = " + result );
            }
            if (choise == 5) {
                System.out.println("Вы выбрали операцию - факториал.");
                System.out.print("Введите число: ");
                int num1 = sc.nextInt(), res = 1;
                for (int i=1; i<=num1;i++) {
                    res = res * i;
                }
                System.out.println("Факториал числа " +num1+ " = " + res );
            }

        }
    }
}
