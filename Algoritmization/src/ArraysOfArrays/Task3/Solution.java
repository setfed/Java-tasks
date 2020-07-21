package ArraysOfArrays.Task3;

import ArraysOfArrays.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int[][] array = Utilities.genMatrix(5);
        System.out.println("Была сгенерирована следующая матрица");
        Utilities.showMatrix(array);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите номер строки и номер столбца для вывода через пробел");
        String[] input = reader.readLine().split(" ");

        int row = Integer.parseInt(input[0]) - 1;
        int column = Integer.parseInt(input[1]) -1;
        reader.close();

        System.out.println("Выведена строчка № " + (row + 1));
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[row][i] + " ");
        }

        System.out.println();

        System.out.println("Выведен столбeц № " + (column+1));
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][column]);
        }
    }
}
