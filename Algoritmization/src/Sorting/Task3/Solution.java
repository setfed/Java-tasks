package Sorting.Task3;

import Sorting.Utilities;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        selectSort(array);
        Utilities.showArray(array);
    }

    public static void selectSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; ++i) // i - номер текущего шага
        {
            int pos = i;
            temp = array[i];
            for (int j = i + 1; j < array.length; ++j) // цикл выбора наименьшего элемента
            {
                if (array[j] > temp) {
                    pos = j;
                    temp = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = temp; // меняем местами наименьший с a[i]
        }
    }
}
