public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 9. Массивы часть 2");
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalAmount = 0;
        for (int i = 0; i < arr.length; i++) {
            totalAmount += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + totalAmount + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей." +
                " Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double averageSpent = (double) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей ", averageSpent);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}
