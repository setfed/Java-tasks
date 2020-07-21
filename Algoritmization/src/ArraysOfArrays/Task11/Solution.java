package ArraysOfArrays.Task11;

import ArraysOfArrays.Utilities;

public class Solution {
    public static void main(String[] args) {
        int rows = 10;
        int columns = 20;
        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = (int) (Math.random() * 15);
            }
        }
        System.out.println("Матрица имеет следующий вид");
        Utilities.showMatrix(array);

        System.out.println("\nНомера строка, в которых число 5 встречается более 3 раз");
        for (int i = 0; i < rows; i++) {
            int count5 = 0;
            for (int j = 0; j < columns; j++) {
                if (array[i][j] == 5) {
                    count5++;
                }
                if (count5 >= 3) {
                    System.out.print((i + 1) + " ");
                    count5 = 0;
                }
            }
        }


    }

}

