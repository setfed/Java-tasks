package Cycles.Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите границы промежутка для поиска делителей через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        reader.close();

        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        for (int i = m; i <= n; i++) {
            for (int e = 2; e < i - 1; e++) {
                if (i % e == 0) {
                    System.out.printf("Число %d, Делитель %d", i, e);
                    System.out.println();
                }
            }
        }
    }
}
