package ArraysOfArrays.Task15;

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

        int max = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("\nМаксимальный элемент матрицы равен " + max + "\n");

        //Замена нечетных по порядку элементов на максимальный
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j % 2 == 0) {
                    array[i][j] = max;
                }
            }
        }
        System.out.println("Замена нечетных по порядку элементов на максимальный");
        Utilities.showMatrix(array);
        System.out.println();

        //Замена нечетных по значению элементов на максимальный
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] % 2 == 1 && array[i][j] != 0) {
                    array[i][j] = max;
                }
            }
        }

        System.out.println("Замена нечетных по значению элементов на максимальный");
        Utilities.showMatrix(array);
    }
}
