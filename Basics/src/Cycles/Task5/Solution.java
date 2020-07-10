package Cycles.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите положительное число e");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Double e = Double.parseDouble(reader.readLine());
        reader.close();
        double sum = 0;
        double n = 100;

        for (int i = 0; i < n; i++) {
            double a = (1 / (pow(2, i))) + (1 / (pow(3, i)));
            if (abs(a) >= e) {
                sum += a;
                n++;
            }
        }
        System.out.println(sum);
    }
}
