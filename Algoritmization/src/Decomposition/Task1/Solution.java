package Decomposition.Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите 2 числа m n для поиска:");
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.close();
            System.out.println("НОД: " + gcd(n, m));
            System.out.println("НОК: " + lcm(n, m));
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

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
