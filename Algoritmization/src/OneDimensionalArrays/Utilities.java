package OneDimensionalArrays;

import static java.lang.Math.random;

public class Utilities {

    public static void scanForK(int[] array, int K) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % K == 0) {
                sum += array[i];
            }
        }
        System.out.printf("Сумма чисел кратных %d равна %d", K, sum);
    }

    public static void generateRandomNums(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (random() * 10);
        }
    }
}
