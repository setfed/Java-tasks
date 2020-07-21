package Decomposition.Task11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            int n, m;
            System.out.println("Введите 2 числа");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            m = sc.nextInt();
            sc.close();

            int[] nA = convertToArray(n);
            int[] mA = convertToArray(m);

            if (checkNums(nA, mA))
                System.out.printf("В числе %d цифр больше", n);
            else
                System.out.printf("В числе %d цифр больше", m);

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkNums(int[] array1, int[] array2) {
        if (array1.length > array2.length)
            return true;
        else
            return false;
    }

    public static int[] convertToArray(int a) {
        return Integer.toString(a).chars().map(c -> c - '0').toArray();
    }
}
