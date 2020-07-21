package Decomposition.Task5;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Укажите размер массива:");
                n = sc.nextInt();
            } while (n < 1);
            sc.close();
            int[] arr = new int[n];
            for (int i = 0; i < n; ++i)
                arr[i] = -50 + (int) (Math.random() * 100);
            System.out.println("Исходный массив");
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();
            Arrays.sort(arr);
            int i = arr.length - 1;
            while (i > 0 && arr[i] == arr[i - 1])
                i--;
            if (arr.length == 1 || i == 0)
                System.out.println("Невозможно найти 2ое по величине число в массиве ");
            else
                System.out.println("2ое по величине число " + arr[i - 1]);
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
