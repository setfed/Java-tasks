package Cycles.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Введите любое целое положительное число");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String initInput = reader.readLine();
            Integer input = Integer.parseInt(initInput);
            int sum = 0;

            if (input < 0) {
                System.out.println("Вы ввели отрицательное число");
                System.exit(0);
            }

            for (int i = 1; i <= input; i++) {
                sum += i;
            }

            System.out.println(sum);
        } catch (NumberFormatException e) {
            System.out.println("Вы не ввели число или ввели нецелое число");
        }
    }
}
