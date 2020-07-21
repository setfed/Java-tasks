package ArraysOfArrays.Task14;

import ArraysOfArrays.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.random;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество строк и столбцов генерируемой матрицы через пробел, где количество строк >=количество столбцов");
        String[] input = reader.readLine().split(" ");
        reader.close();

        int rows = Integer.parseInt(input[0]);
        int columns = Integer.parseInt(input[1]);

        if (rows < columns) {
            System.out.println("Количество строк меньше количества столбцов");
            System.exit(0);
        }

        int[][] array = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 0;
                if (j >= i) {
                    array[i][j] = 1;
                }
            }
        }

        Utilities.showMatrix(array);
    }
}
