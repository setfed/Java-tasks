package Sorting.Task5;

import Sorting.Utilities;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1,4,8,-2,33,200,2,1};
        insertBinSort(array);
        Utilities.showArray(array);

    }

    public static void insertBinSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];

            int j = Math.abs(binarySearch(array, 0, i, x) + 1);

            System.arraycopy(array, j, array, j + 1, i - j);

            array[j] = x;
        }
    }

    public static int binarySearch(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = array[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid;
        }
        return -(low + 1);
    }

}
