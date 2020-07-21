package ArraysOfArrays.Task7;

import ArraysOfArrays.Utilities;

import java.util.Scanner;

import static java.lang.Math.sin;
import static java.lang.Math.pow;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        double[][] array = genMatrix(size);
        System.out.println("Матрица имеет следующий вид");
        Utilities.showMatrix(array);

        int countPos = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i][j] > 0) {
                    countPos++;
                }
            }
        }

        System.out.printf("Количество положительных элементов матрицы %d", countPos);

        scanner.close();
    }

    public static double[][] genMatrix(double size) {
        double[][] array = new double[(int) size][(int) size];
        for (double i = 0; i < size; i++) {
            for (double j = 0; j < size; j++) {
                array[(int) i][(int) j] =  sin(((pow(i, 2) - pow(j, 2)) / size));
            }
        }
        return array;
    }
}
