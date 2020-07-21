package ArraysOfArrays.Task1;

import ArraysOfArrays.Utilities;
import org.w3c.dom.ls.LSOutput;

public class Solution {
    public static void main(String[] args) {
        int[][] array = Utilities.genMatrix(5);
        System.out.println("Была сгенерирована следующая матрица");
        Utilities.showMatrix(array);

        System.out.println("В следующих столбцах первый элемент больше последнего");
        showMatrix(array);

    }

    public static void showMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) { //Проход по строчкам
            for (int j = 0; j < array.length; j++) { //Проход по столбцам
                if (array[0][j] > array[array.length - 1][j]) {
                    System.out.print(array[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
