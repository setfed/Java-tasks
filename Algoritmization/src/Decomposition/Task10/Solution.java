package Decomposition.Task10;

import javax.swing.*;
import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            int n;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            do {
                System.out.println("Введите число");
                String input = reader.readLine();
                n = Integer.parseInt(input);
                int[] array = toDigits(input);
                for (int i : array) {
                    System.out.print(i + " ");
                }
            } while (n < 0);
            reader.close();

        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] toDigits(String numbers) {
        char[] digits = numbers.toCharArray();
        int[] array = new int[digits.length];

        for (int i = 0; i < digits.length; i++) {
            array[i] = Character.getNumericValue(digits[i]);
        }

        return array;
    }
}
