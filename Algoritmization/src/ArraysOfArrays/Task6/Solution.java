package ArraysOfArrays.Task6;

import ArraysOfArrays.Utilities;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();

        int[][] array = genMatrix(size);
        Utilities.showMatrix(array);
    }

    public static int[][] genMatrix(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if ((j >= i && j + i < size) || (j <= i && j + i >= size - 1)) {
                    array[i][j] = 1;
                }
            }
        return array;
    }
}
