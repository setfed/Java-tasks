package Decomposition.Task14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Введите положительное число n:");
                n = sc.nextInt();
            } while (n < 1);
            sc.close();

            System.out.printf("Числа Армстронга от 1 до %d:\n", n);

            for (int i = 1; i <= n; ++i) {
                if (isArm(i))
                    System.out.println(i);
            }

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isArm(int a) {
        long n = a;
        long sum = 0;

        int power = (int) Math.floor(Math.log10(n == 0 ? 1 : n)) + 1;

        while (n != 0) {
            int digit = (int) n % 10;
            sum += Math.pow(digit, power);
            n /= 10;
        }

        return sum == a;    }
}
