package ArraysOfArrays.Task12;

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

        System.out.println("\nСортировка по возрастанию элементов в строках");
        sortRowsAsc(array);
        Utilities.showMatrix(array);

        System.out.println("\nСортировка по убыванию элементов в строках");
        sortRowsDes(array);
        Utilities.showMatrix(array);
    }

    public static int[][] sortRowsAsc(int[][] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; ++i)
            for (int j = 0; j < array.length - 1; ++j)
                for (int k = 0; k < array.length - 1; ++k)
                    if (array[i][k + 1] < array[i][k]) {
                        tmp = array[i][k + 1];
                        array[i][k + 1] = array[i][k];
                        array[i][k] = tmp;
                    }
        return array;
    }

    public static int[][] sortRowsDes(int[][] array) {
        int tmp = 0;
        for (int i = 0; i < array.length; ++i)
            for (int j = 0; j < array.length - 1; ++j)
                for (int k = 0; k < array.length - 1; ++k)
                    if (array[i][k + 1] > array[i][k]) {
                        tmp = array[i][k + 1];
                        array[i][k + 1] = array[i][k];
                        array[i][k] = tmp;
                    }
        return array;
    }

}
