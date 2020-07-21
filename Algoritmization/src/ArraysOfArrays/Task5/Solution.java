package ArraysOfArrays.Task5;

import ArraysOfArrays.Utilities;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();

        int[][] array = genMatrix(size,size);
        Utilities.showMatrix(array);
    }

    public static int[][] genMatrix(int row, int column) {
        int count = 1;
        int[][] array = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = count;
            }
            count++;
            column--;
        }
        return array;
    }
}
