package ArraysOfArrays.Task13;

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

        //Сортировка элементов по убыванию внутри столбцов
        System.out.println("\nСортировка по убыванию элементов в столбцах");
        sortColsDes(array);
        Utilities.showMatrix(array);

        System.out.println("\nСортировка по возрастанию элементов в столбцах");
        sortColsAsc(array);
        Utilities.showMatrix(array);
    }

    public static int[][] sortColsDes(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                for (int k = j + 1; k < array.length; k++)
                    if (array[k][i] > array[j][i]) {
                        int temp = array[k][i];
                        array[k][i] = array[j][i];
                        array[j][i] = temp;
                    }
        return array;
    }


    public static int[][] sortColsAsc(int[][] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                for (int k = j + 1; k < array.length; k++)
                    if (array[k][i] < array[j][i]) {
                        int temp = array[k][i];
                        array[k][i] = array[j][i];
                        array[j][i] = temp;
                    }
        return array;
    }
}
