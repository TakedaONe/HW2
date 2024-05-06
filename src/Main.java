//то что находится в "//" первая задача
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.print("Введите температуру на улице: ");
        double temperature = scanner.nextDouble();
/*
        String result = PermissionChecker.permission(age, temperature);
        System.out.println(result);
*/
        scanner.close();
    }
/*
    public static class PermissionChecker {

        public static String permission(int age, double temperature) {
            if (age >= 18 && temperature >= 20) {
                return "Да, вы можете выходить на улицу.";
            } else {
                return "Нет, лучше остаться дома.";
            }
        }
    }
*/
    public static String goForAWalk(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}
