package Sorting.Task8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Введите число n для создания массива размера n");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] denominators = new int[size];
        int[] numerators = new int[size];

        genNum(denominators);
        genNum(numerators);

        System.out.println("Исходные дроби");
        printFractions(numerators, denominators);

        int mylcm = denominators[0];

        for (int i = 1; i < size; ++i)
            mylcm = lcm(mylcm, denominators[i]);
        for (int i = 0; i < size; ++i) {
            numerators[i] *= ((double) mylcm / denominators[i]);
            denominators[i] = mylcm;
        }

        System.out.println("Общий знаменатель равен " + mylcm);
        for (int i = 0; i < size - 1; ++i) {
            for (int j = i + 1; j < size; ++j) {
                if (numerators[i] > denominators[j]) {
                    int tmp = numerators[i];
                    numerators[i] = numerators[j];
                    numerators[j] = tmp;
                    tmp = denominators[i];
                    denominators[i] = denominators[j];
                    denominators[j] = tmp;
                }
            }
        }
        System.out.println("Отсортированные дроби:");
        printFractions(numerators, denominators);
    }


    public static void genNum(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i] = 1 + (int) (Math.random() * 30);
        }
    }

    public static void printFractions(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; ++i)
            System.out.print(array1[i] + "/" + array2[i] + " ");
        System.out.println();
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
