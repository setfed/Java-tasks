package ArraysOfArrays.Task9;

import ArraysOfArrays.Utilities;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        //Получаем размер генерируемого массива

        int size = scanner.nextInt();
        scanner.close();

        int[][] array = Utilities.genMatrix(size);
        System.out.println("Была сгенерирована следующая матрица");
        Utilities.showMatrix(array);

        int[] columnSizes = new int[size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                columnSizes[j] += array[i][j];
            }
        }

        System.out.println("Суммы столбцов равны");
        for (int i : columnSizes) {
            System.out.print(i + " ");
        }

        int max = 0;
        for (int i : columnSizes) {
            if (i > max) {
                max = i;
            }
        }

        int maxIndex = find(columnSizes, max) + 1;
        System.out.println("\nСтолбец " + maxIndex + " содержит максимальное значение " + max);
    }

    public static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == value) {
                return i;
            }

        return value;
    }
}
