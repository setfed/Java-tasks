package OneDimensionalArrays.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемое количество членов последовательности и число Z");

        //Получаем размер массива и кратное число
        String[] input = reader.readLine().split(" ");
        reader.close();

        int[] array = new int[Integer.parseInt(input[0])];
        int Z = Integer.parseInt(input[1]);
        int count = 0;

        //Генерация последовательности
        int num = 1; //Число для генерации последовательности
        for (int i = 0; i < array.length ; i++) {
            num += 3;
            array[i] = num;
        }

        //Замена чисел больше Z на Z
        for (int i = 0; i < array.length; i++) {
            if (array[i] > Z) {
                array[i] = Z;
                count++;
            }
        }

        //Вывод массива
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.printf("Количество замен: %d", count);
    }
}