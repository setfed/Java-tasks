package Sorting.Task6;

import Sorting.Utilities;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 8, -2, 33, 200, 2, 1};
        shellSort(array);
        Utilities.showArray(array);
    }

    public static void shellSort(int[] array) {
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int temp = array[i];
                int j;
                for ( j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
    }
}
