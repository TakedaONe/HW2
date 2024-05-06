import java.util.Random;

public class Main {

    //1
    public static String permission(int age, int temperature) {
        //2
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    //4
    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static int generateRandomTemperature() {
        Random random = new Random();
        return random.nextInt(71) - 30;
    }

    public static void main(String[] args) {
        //3
        for (int i = 0; i < 5; i++) {
            //5
            int randomAge = generateRandomAge();
            int randomTemperature = generateRandomTemperature();
            String result = permission(randomAge, randomTemperature);
            System.out.println("Возраст: " + randomAge + ", Температура: " + randomTemperature + " - " + result);
        }
    }
}
