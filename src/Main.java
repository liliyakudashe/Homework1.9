import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задача 1
        System.out.println("Первая задача");
        int sum = 0;
        for (int arri : arr) {
            sum += arri;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача 2
        System.out.println("Вторая задача");
        int maximumSpendingPerDay = 0;
        int minimumSpendingPerDay = 2_000_001;
        for (int j : arr) {
            if (j > maximumSpendingPerDay) {
                maximumSpendingPerDay = j;
            }
            if (j < minimumSpendingPerDay){
                minimumSpendingPerDay = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maximumSpendingPerDay);
        System.out.println("Минимальная сумма трат за день составила " + minimumSpendingPerDay);

        // Задача 3
        System.out.println("Третяя задача");
        double averageValue = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц " + averageValue);

        // Задача 4
        //
        System.out.println("Четвёртая задача");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}