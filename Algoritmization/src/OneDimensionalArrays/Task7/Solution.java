package OneDimensionalArrays.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.random;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемый размер массива");

        //Получаем размер массива
        String input = reader.readLine();
        int arraySize = Integer.parseInt(input);
        int[] array = new int[arraySize];
        reader.close();

        //Имитируем разные действительные числа от -15 до +15
        generateRandomNums(array);
        System.out.println("Были сгенерированы следующие действительные числа");
        for (int i : array) {
            System.out.print(i + " ");
        }

        int sum = getMaxSum(array);
        System.out.println();
        System.out.println("Максимальная сумма пар равна " + sum);
    }

    public static int getMaxSum(int[] array) {
        int maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }

    public static void generateRandomNums(int[] array) { //Генерация случайных чисел от 0 до размерности массива
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((random() * 30) - 15);
        }
    }
}
