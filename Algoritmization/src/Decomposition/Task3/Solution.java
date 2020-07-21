package Decomposition.Task3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите длину стороны a правильного шестиугольника:");
            double a = sc.nextDouble();
            sc.close();
            System.out.println("Площадь равна: " + square(a));
        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static double square(double a) {
        return 3 * (Math.pow(a, 2) * Math.sqrt(3)) / 2;
    }
}
