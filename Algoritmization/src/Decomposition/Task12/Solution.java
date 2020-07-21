package Decomposition.Task12;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            int K, N;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Введите числа K и N: ");
                K = scanner.nextInt();
                N = scanner.nextInt();

            } while (K < 0 || N < 0);
            scanner.close();

            if (K > 9 * numberDigits(N - 1)) {
                System.out.println("Нет значений удовлетворяющий условию");
                return;
            }

            int count = 0;
            for (int j = 1; j <= N; j++) {
                if (sumDigits(j) == K && j <= N) {
                    count++;
                }
            }

            int a[] = new int[count];
            int number = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = number; j <= N; j++) {
                    if (sumDigits(j) == K && j <= N) {
                        a[i] = j;
                        number = j + 1;
                        break;
                    }
                }
            }

            System.out.println(Arrays.toString(a));
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int sumDigits(int A) {
        int sum = 0;
        do {
            sum += A % 10;
            A /= 10;
        } while (A != 0);
        return sum;
    }

    public static int numberDigits(int A) {
        int count = 0;
        do {
            A /= 10;
            count++;
        }
        while (A != 0);
        return count;
    }

}
