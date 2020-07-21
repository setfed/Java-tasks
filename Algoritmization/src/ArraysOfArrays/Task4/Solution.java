package ArraysOfArrays.Task4;

import ArraysOfArrays.Utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.random;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите размер матрицы");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();

        int[][] array = genMatrix(size);
        System.out.println("Была сгенерирована следующая матрица");
        Utilities.showMatrix(array);
    }

    public static int[][] genMatrix(int size) {
        int n = 1;
        int sizeN = size;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < sizeN; j++) {
                if (i % 2 == 0) {
                    array[i][j] = n;
                    n++;
                } else {
                    array[i][j] = size;
                    size-=1;
                }
            }
            n=1;
            size = sizeN;
        }
        return array;
    }
}
