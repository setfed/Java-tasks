package Linear.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.tan;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите значение x, y через пробел");
        //Считывание и присвоение переменных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        String[] params = input.split(" ");
        double x = Double.parseDouble(params[0]);
        double y = Double.parseDouble(params[1]);

        double result = (sin(x) + cos(y)) / (cos(x) - sin(y)) * (tan(x * y));
        System.out.println(result);

    }
}

