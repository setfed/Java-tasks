package Linear.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Solution {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите значение a, b, c через пробел");
        //Считывание и присвоение переменных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        String[] params = input.split(" ");
        double a = Double.parseDouble(params[0]);
        double b = Double.parseDouble(params[1]);
        double c = Double.parseDouble(params[2]);

        double result = ((b + sqrt((pow(b, 2) + 4 * a * c))) / (2 * a)) - ((pow(a, 3) * c) + pow(b, -2));
        System.out.println(result);
    }
}

