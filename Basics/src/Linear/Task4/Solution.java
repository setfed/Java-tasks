package Linear.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите значение переменной в формате nnn.ddd, где nnn-целая часть, а ddd-дробная часть числа");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Double input = Double.parseDouble(reader.readLine());
        reader.close();

        double result = (input * 1000) % 1000 + input.intValue() / 1000.0;
        System.out.println(result);
    }
}

