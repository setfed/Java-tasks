package Sorting.Task2;

import Sorting.Utilities;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array1 = {1, 4, 7};
        int[] array2 = {2, 5, 8};

        array1 = newPosSeq(array1, array2);
        Utilities.showArray(array1);
    }

    public static int[] newPosSeq(int[] array1, int[] array2) {
        array1 = Arrays.copyOf(array1, (array1.length + array2.length));
        System.arraycopy(array2, 0, array1, array2.length,array2.length);
        Arrays.sort(array1);

        return array1;
    }
}
