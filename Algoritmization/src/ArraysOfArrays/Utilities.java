package ArraysOfArrays;

import static java.lang.Math.random;

public class Utilities {
    public static int[][] genMatrix(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (int) (random() * 10);
            }
        }
        return array;
    }

    public static void showMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void showMatrix(double[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                double f = array[i][j];
                System.out.printf("%.2f ",f);
            }
            System.out.println();
        }
    }

    public static void printMatrix (int matrix[][]) {
        for (int[] array : matrix) {
            for (int x : array) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
        System.out.println("");
    }

}
