package Branching.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.max;
import static java.lang.Math.min;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите числа a,b,c,d через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Трансформируем для работы
        String[] input = reader.readLine().split(" ");

        Double a = Double.parseDouble(input[0]);
        Double b = Double.parseDouble(input[1]);
        Double c = Double.parseDouble(input[2]);
        Double d = Double.parseDouble(input[3]);

        Double result = max(min(a, b), min(c, d));
        System.out.println(result);
    }
}
