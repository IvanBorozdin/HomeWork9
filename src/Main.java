import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int[] arr2 =new int[30];
        for (int i = 0; i < arr2.length ; i++) {
            arr2=arr;
            System.out.print(arr2[i] + " , ");

        }
        System.out.println();
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int[] arr2 = new int[30];
        int max = 99999;
        int min =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i] ;

            }
        }
            System.out.print(max);




        System.out.println();
    }
    public static void task3(){
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        int[] arr2 = new int[30];
        int max = 99999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]*30 ;
            }
        }
        System.out.print(max);
        System.out.println();


    }


    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println("Начальный массив:" + Arrays.toString(reverseFullName));

        System.out.println("Перевернутый");
        for (int i = reverseFullName.length - 1; i >=0 ; --i) {
            System.out.print(reverseFullName[i]);

            }

        }

        }






