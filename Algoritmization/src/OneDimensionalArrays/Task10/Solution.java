package OneDimensionalArrays.Task10;

import OneDimensionalArrays.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемый размер массива");

        //Получаем размер массива
        String input = reader.readLine();
        int arraySize = Integer.parseInt(input);
        int[] array = new int[arraySize];
        reader.close();

        //Генерируем случайные действительные числа
        Utilities.generateRandomNums(array);
        for (int i : array) {
            System.out.print(i + " ");
        }

        //Удаляем каждый 2-ой элемент
        System.out.println();
        array = getLessArray(array);

        //Вывод
        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    public static int[] getLessArray(int[] arr) {
        int pivot = (arr.length + 1) / 2;

        if (arr.length % 2 == 0) {
            for (int i = 1; i < pivot; i++) {
                arr[i] = arr[2 * i];
            }

            for (int j = (arr.length / 2); j < arr.length; j++) {
                arr[j] = 0;
            }
        } else {
            for (int i = 1; i < pivot; i++) {
                arr[i] = arr[2 * i];
            }
            for (int j = (arr.length / 2 + 1); j < arr.length; j++) {
                arr[j] = 0;
            }
        }
        return Arrays.copyOf(arr, arr.length);
    }
}
