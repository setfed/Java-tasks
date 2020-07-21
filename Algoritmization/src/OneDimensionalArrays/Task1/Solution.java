package OneDimensionalArrays.Task1;

import OneDimensionalArrays.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемое количество членов массива и кратное число через пробел");

        //Получаем размер массива и кратное число
        String[] input = reader.readLine().split(" ");
        reader.close();

        int[] array = new int[Integer.parseInt(input[0])];
        int K = Integer.parseInt(input[1]);

        //Генерируем случайные цифры в пределах, указанных в методе
        Utilities.generateRandomNums(array);

        System.out.printf("Был сгенерирован массив, состоящий из %d чисел, ищу сумму кратных %d ", Integer.parseInt(input[0]), K);
        System.out.println();

        //Проверяем и суммируем числа кратных K
        Utilities.scanForK(array, K);

    }




}
