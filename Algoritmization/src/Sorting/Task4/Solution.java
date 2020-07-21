package Sorting.Task4;

import Sorting.Utilities;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        bubbleSort(array);
        Utilities.showArray(array);
    }

    public static void bubbleSort(int[] array) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < array.length - 1; ++i) // i - номер прохода
        {
            for (int j = 0; j < array.length - 1; ++j) // внутренний цикл прохода
            {
                if (array[j + 1] > array[j]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    count++;
                }
            }
        }

        System.out.println("Количество перестановок " + count);
    }
}
