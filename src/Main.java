import java.util.Arrays;

public class Main {
    public static void main( String[] args ) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
    }
    private static void task1() {
        // задача 1
        int [] mass = new int[3];
        mass [0] = 1;
        mass [1] = 2;
        mass [2] = 3;
        int massLength = mass.length;

        double [] mass1 = {1.57, 7.654, 9.986};

        byte [] mass2 = {1, 2, 3, 4, 5};
    }
    public static void task2 () {
        // задача 2
        System.out.println(" задача 2");
        int [] mass = new int[3];
        mass [0] = 1;
        mass [1] = 2;
        mass [2] = 3;
        int massLength = mass.length;

        double [] mass1 = {1.57, 7.654, 9.986};

        byte [] mass2 = {1, 2, 3, 4, 5};

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + ", ");
        }
        System.out.println();
        for (int a = 0; a < mass1.length; a++) {
            System.out.print(mass1[a] + ", ");
        }
        System.out.println();
        for (int b = 0; b < mass2.length; b++) {
            System.out.print(mass2[b] + ", ");
        }
        System.out.println();
    }
    public static void task3 () {
        // задача 3
        System.out.println("задача 3");
        int [] mass = new int[3];
        mass [0] = 1;
        mass [1] = 2;
        mass [2] = 3;
        int massLength = mass.length;

        double [] mass1 = {1.57, 7.654, 9.986};

        byte [] mass2 = {1, 2, 3, 4, 5};

        for (int i2 = mass.length - 1; i2 >= 0 ; i2--) {
            System.out.print(mass[i2] + ", ");
        }
        System.out.println();
        for (int a2 = mass1.length - 1; a2 >=0; a2--) {
            System.out.print(mass1[a2] + ", ");
        }
        System.out.println();
        for (int b2 = mass2.length - 1;b2 >=0;b2--) {
            System.out.print(mass2[b2] + ", ");
        }
        System.out.println();
    }
    public static void task4 () {
        // задача 4
        System.out.println("задача 4");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int ind = 0; ind < array.length; ind++){
            if (array[ind] % 2 != 0) {
                array[ind] = ind + 2;
            } else {
                array[ind] = ind +1;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task5() {
        // задача 5
        System.out.println("задача 5");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
    }
    public static void task6 (){
        System.out.println("задача 6");
        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = 0;
        for(final int current : arr){
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
        for (final int current2 : arr) {
            if (current2 < min) {
                min = current2;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + min + " рублей.");
    }
    public static void task7 () {
        System.out.println("задача 7");
        int [] arr = generateRandomArray();
        double sum = 0;
        for (double i : arr) {
            sum = sum + i;
        }
        double average = sum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }
    public static void task8 () {
        System.out.println("задача 8");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}
