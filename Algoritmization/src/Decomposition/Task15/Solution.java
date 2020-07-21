package Decomposition.Task15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.print("Введите количество цифр в числе ");
                n = sc.nextInt();
            } while (n < 0);
            sc.close();

            int start = startNumber(n);
            for (int i = start; i < start * 10; i++) {
                if (increasingNumber(i))
                    System.out.println(i);
            }

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int startNumber(int n) {
        int i = 1;
        do {
            i *= 10;
            n--;
        } while (n != 1);
        return i;
    }

    public static boolean increasingNumber(int i) {
        do {
            int n = i % 10;
            if (n - (i / 10 % 10) != 1) {
                return false;
            }
            i /= 10;
        } while (i / 10 != 0);
        return true;
    }
}
