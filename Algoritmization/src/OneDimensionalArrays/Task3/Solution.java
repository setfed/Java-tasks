package OneDimensionalArrays.Task3;

import OneDimensionalArrays.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.random;
import static java.lang.Math.sin;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемый размер массива");

        //Получаем размер массива
        String input = reader.readLine();
        int arraySize = Integer.parseInt(input);
        int[] array = new int[arraySize];
        reader.close();

        //Генерируем случайные числа
        System.out.printf("Был сгенерирован массив размером %d \n", arraySize);
        generateRandomNums(array);

        //Вывод членов массива
        for (int i : array
        ) {
            System.out.print(i + " ");
        }

        int pos = 0;
        int neg = 0;
        int zeros = 0;

        //Подсчет значений
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pos++;
            } else if (array[i] < 0) {
                neg++;
            } else {
                zeros++;
            }
        }
        //Вывод значений
        System.out.printf("\n\nКоличество:\nПоложительных значений %d \nОтрицательных значений %d \nНулевых значений %d", pos, neg, zeros);

    }

    public static void generateRandomNums(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((random() * 20) - 10);
        }
    }
}
