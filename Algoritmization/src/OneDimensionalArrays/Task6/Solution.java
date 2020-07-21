package OneDimensionalArrays.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

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

        //Имитируем простую последовательность
        int n = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n += 3;
        }

        //Вычисление суммы чисел, у которых индексы являются простыми числами
        int sum = 0;

        for (int i = 2; i < array.length; i++) {
            if (!isPrime(i)) {
                sum += array[i];
            }
        }
        System.out.printf("Сумма чисел, индекс которых является простым числом равна %d", sum);
    }


    public static boolean isPrime(final int number) {
        return IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }


}
