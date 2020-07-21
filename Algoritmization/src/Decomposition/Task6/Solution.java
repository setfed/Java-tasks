package Decomposition.Task6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int a, b, c;
            do {
                System.out.println("Введите 3 положительных числа a, b, c:");
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                sc.close();
            } while (a < 1 || b < 1 || c < 1);
            sc.close();

            if (areCoPrime(a, b, c))
                System.out.println("Числа взаимно простые");
            else
                System.out.println("Числа не взаимно простые");
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean areCoPrime(int a, int b, int c) {
        int mygcd = gcd(a, b);
        mygcd = gcd(mygcd, c);
        return mygcd == 1;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
