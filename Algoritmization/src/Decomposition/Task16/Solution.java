package Decomposition.Task16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n;
            do {
                System.out.print("Введите количество цифр в числе n>=2\n");
                n = sc.nextInt();
            } while (n < 2);
            sc.close();

            int start = startNumber(n);
            long sum = 0;
            for (int i = start; i < start * 10; i++) {
                if (oddNumber(i)) {
                    sum += i;
                }
            }

            System.out.println("Сумма чисел с нечетными цифрами равна " + sum);
            System.out.println("Количество четных чисел в числе " + numberEven(sum));

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

    public static boolean oddNumber(int i) {
        int sum = 0;
        do {
            if (i % 10 % 2 != 0)
                sum += i;
            else
                return false;
            i /= 10;
        } while (i != 0);
        return true;
    }

    public static int numberEven(long i) {
        int count = 0;
        do {
            if (i % 10 % 2 == 0)
                count++;
            i /= 10;
        } while (i != 0);
        return count;
    }
}
