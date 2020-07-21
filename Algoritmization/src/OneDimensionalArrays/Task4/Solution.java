package OneDimensionalArrays.Task4;

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

        for (int i : array
        ) {
            System.out.printf(i + " ");
        }
        System.out.println();

        //Ищем значения наибольшего и наименьшего элемента массива
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                maxIndex = i;
                max = array[i];
            }
            if (array[i] < min) {
                minIndex = i;
                min = array[i];
            }
        }

        //Вывод старого массива
        System.out.printf("Наибольший элемент массива равен %d и имел индекс %d \n", max, maxIndex);
        System.out.printf("Наименьший элемент массива равен %d и имел индекс %d \n", min, minIndex);

        //Смена значений и индексов
        array[maxIndex] = min;
        array[minIndex] = max;
        int tempIndex = minIndex;
        minIndex = maxIndex;
        maxIndex = tempIndex;

        //Вывод нового массива
        System.out.println("Теперь массив имеет вид");
        for (int i : array
        ) {
            System.out.printf(i + " ");
        }
        System.out.println();

        System.out.printf("Наибольший элемент массива равен %d и имеет индекс %d \n", max, maxIndex);
        System.out.printf("Наименьший элемент массива равен %d и имеет индекс %d \n", min, minIndex);
    }

    public static void generateRandomNums(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((random() * 20) - 10);
        }
    }
}
