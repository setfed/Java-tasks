package Decomposition.Task13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Введите  n>2:");
                n = sc.nextInt();
            } while (n < 2);
            sc.close();
            System.out.printf("Простые числа - близнецы от %d до %d\n", n, 2 * n);
            boolean flag = true;
            int i = n;
            while (i < 2 * n - 1) {
                if (isPrime(i) && isPrime(i + 2)) {
                    System.out.println(i + " " + (i + 2));
                    i += 2;
                    flag = false;
                } else ++i;
            }
            if (flag)
                System.out.println("Таких чисел нет");
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isPrime(int a) {
        int k = 1, kol = 0;
        while (k <= Math.sqrt(a)) {
            if (a % k == 0) {
                kol++;
            }
            k++;
        }
        return a != 1 && kol + 1 == 2;
    }
}
