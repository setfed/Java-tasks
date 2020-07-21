package Sorting;

public class Utilities {
    public static int[] genArray(int size) {
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * 10));

        }

        return array;
    }

    public static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
