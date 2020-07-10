package Branching.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите градусы 2-ух углов треугольника через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Трансформируем для работы
        String[] input = reader.readLine().split(" ");

        Double angleA = Double.parseDouble(input[0]);
        Double angleB = Double.parseDouble(input[1]);
        Double angleC = 180 - angleA - angleB;

        //Проверка треугольника
        if (angleC > 0) {
            System.out.print("Треугольник существует");
            if (angleA == 90 || angleB == 90 || angleC == 90) {
                System.out.println(" и он прямоугольный");
                System.out.printf("Его углы %.2f° %.2f° %.2f°", angleA, angleB, angleC);
            } else {
                System.out.println(", но он не прямоугольный");
                System.out.printf("Его углы %.2f° %.2f° %.2f°", angleA, angleB, angleC);
            }
        } else {
            System.out.println("Это не треугольник");
        }
    }
}

