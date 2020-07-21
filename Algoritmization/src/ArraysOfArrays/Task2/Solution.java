package ArraysOfArrays.Task2;

import ArraysOfArrays.Utilities;

public class Solution {
    public static void main(String[] args) {
        int[][] array = Utilities.genMatrix(5);
        System.out.println("Была сгенерирована следующая матрица");
        Utilities.showMatrix(array);

        System.out.println("Вот список элементов стоящих по диагонали");
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j <= i; j++) {
                System.out.print(array[i][j] +  " ");
            }
        }
    }
}
