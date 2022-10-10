import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] expenses = generateRandomArray();
        System.out.println(Arrays.toString(expenses));

        System.out.println("Задание-1");
        int sum = 0;
        for (int expense : expenses) {
            sum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        System.out.println("Задание-2");
        OptionalInt Max = Arrays.stream(expenses).max();
        OptionalInt Min = Arrays.stream(expenses).min();
        int maximumAmount = Max.getAsInt();
        int minimumAmount = Min.getAsInt();
        System.out.println("Максимальная сумма трат за день составила " + maximumAmount + " рублей.");
        System.out.println("Минимальная сумма трат за день составила " + minimumAmount + " рублей.");

        System.out.println("Задание-3");
        double sumPerMonth = 0;
        for (double expense : expenses) {
            sumPerMonth += expense/30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sumPerMonth + " рублей.");

        System.out.println("Задание-4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }






    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}