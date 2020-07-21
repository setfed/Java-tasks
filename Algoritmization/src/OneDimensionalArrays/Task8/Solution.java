package OneDimensionalArrays.Task8;

import OneDimensionalArrays.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемый размер массива");

        //Получаем размер массива
        String input = reader.readLine();
        int arraySize = Integer.parseInt(input);
        int[] array = new int[arraySize];
        reader.close();

        //Имитируем простую последовательность
        int n = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n += 3;
        }

        //Вывод изначальной последовательности
        for (int i : array) {
            System.out.print(i + " ");
        }

        int[] newArray = deleteMinValue(array);
        System.out.println();

        //Вывод последователь после удаления наименьшего значения
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] deleteMinValue(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив нулевой длины!");
        }

        int minCount = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];

            }
        }

        for (int i : array) {
            if (i == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        return result;
    }
}
