package Linear.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите значение a, b, c через пробел");
        //Считывание и присвоение переменных
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        String[] params = input.split(" ");
        reader.close();
        double a = Double.parseDouble(params[0]);
        double b = Double.parseDouble(params[1]);
        double c = Double.parseDouble(params[2]);

        //Вывод
        double result = ((a - 3) * b / 2) + c;
        System.out.println("z =  " + result);
    }
}
