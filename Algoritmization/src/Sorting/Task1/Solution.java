package Sorting.Task1;

import Sorting.Utilities;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //Генерируем 2 массива с разными количеством элементов
        int[] array1 = Utilities.genArray((int) (Math.random() * 10) + 1);
        int[] array2 = Utilities.genArray((int) (Math.random() * 10) + 1);

        System.out.println("Были сгенерированы следующие массивы");
        Utilities.showArray(array1);
        System.out.println();
        Utilities.showArray(array2);

        System.out.println();
        System.out.println("Введите число K для вставки элементов 2-ого массива в 1-ый, но не больше " + array1.length);

        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.close();
        if ((k - 1) > array1.length) {
            System.out.println("Нельзя вставить элементы 2-ого массива дальше чем заканчивается 1-ый");
            System.exit(0);
        }

        int[] array3 = new int[(array1.length + array2.length)];

        int count = 0;

        for (int i = 0; i < array3.length; i++) {
            if ((k) > i) {
                array3[i] = array1[i];
            } else if (count < array2.length) {
                array3[i] = array2[count];
                count++;
            } else
                array3[i] = array1[i  - count];
        }

        System.out.println("Новый массив имеет вид");
        Utilities.showArray(array3);
    }
}
