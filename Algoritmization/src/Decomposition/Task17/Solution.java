package Decomposition.Task17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Введите число ");
                n = sc.nextInt();
            } while (n < 0);
            sc.close();

            int count = 0;
            while (n != 0) {
                n = deductionAmount(n);
                count++;
            }
            System.out.println("Количество вычитаний: " + count);

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int deductionAmount(int i) {
        int sum = 0, n = i;
        do {
            sum += n % 10;
            n /= 10;
        } while (n != 0);
        return i - sum;
    }
}
