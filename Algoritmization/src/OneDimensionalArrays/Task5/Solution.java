package OneDimensionalArrays.Task5;

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

        //Генерируем случайные значения
        generateRandomNums(array);

        //Вывод тех чисел, которые больше своего индекса в массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void generateRandomNums(int[] array) { //Генерация случайных чисел от 0 до размерности массива
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((random() * array.length));
        }
    }
}
