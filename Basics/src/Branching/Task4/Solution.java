package Branching.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите длину и ширину отверстия");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Принимаем значения отверстия
        String[] input = reader.readLine().split(" ");
        Double a = Double.parseDouble(input[0]);
        Double b = Double.parseDouble(input[1]);

        //Принимаем значения кирпича
        System.out.println("Введите длину, ширину и высоту кирпича");
        input = reader.readLine().split(" ");
        Double x = Double.parseDouble(input[0]);
        Double y = Double.parseDouble(input[1]);
        Double z = Double.parseDouble(input[2]);

        //Сравниваем
        if (x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b) {
            System.out.println("Кирпич пройдет в отверстие");
        } else {
            System.out.println("Кирпич не пройдет в отверстие");
        }
    }
}
