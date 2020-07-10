package Branching.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
//        System.out.println("Введите координаты точек в формате x,y и нажмите Enter, пустой ввод примет данные");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Coordinates> points = new ArrayList<Coordinates>();
        points.add(new Coordinates(1,1));
        points.add(new Coordinates(2,2));
        points.add(new Coordinates(3,3));

        isLine3(points);

    }

    public static void isLine3(ArrayList<Coordinates> coordinates) {
        Coordinates A = coordinates.get(0);
        Coordinates B = coordinates.get(1);
        Coordinates C = coordinates.get(2);
        if ((A.getY() - B.getY()) * C.getX() + (B.getX() - A.getX()) * C.getY() + (A.getX() * B.getY() - B.getX() * A.getY()) == 0.0) {
            System.out.println("Точки лежат на одной линии");
        } else {
            System.out.println("Точки не лежат на одной линии");
        }
    }
}
