package Cycles.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите начало, конец отрезка,а также шаг");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        reader.close();

        Double a = Double.parseDouble(input[0]);
        Double b = Double.parseDouble(input[1]);
        Double h = Double.parseDouble(input[2]);

        for (double y = a; y <= b; y += h) {
            if (y > 2) {
                System.out.println("y=" + y);
            } else if (y <= 2) {
                System.out.println("y=" + -y);
            }
        }
    }
}
