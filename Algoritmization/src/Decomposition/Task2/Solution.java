package Decomposition.Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите 4 числа для нахождения НОД");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.close();
            System.out.println("НОД: " + gcdOfFour(a, b, c, d));
        } catch (InputMismatchException e) {
            System.out.println("Неверные данные");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int gcdOfFour(int a, int b, int c, int d) {
        int mygcd = gcd(a, b);
        mygcd = gcd(mygcd, c);
        mygcd = gcd(mygcd, d);
        return mygcd;
    }
}
