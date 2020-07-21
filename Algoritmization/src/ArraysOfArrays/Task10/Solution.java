package ArraysOfArrays.Task10;

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

        System.out.println("Положительные числа на главной диагонали:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    if (array[i][j] > 0) {
                        System.out.print(array[i][j] + " ");
                    }
                }
            }
        }
    }
}
