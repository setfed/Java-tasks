package SimpleClassesAndObjects.Task7;

import java.util.Arrays;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle {
    private float sideA;
    private float sideB;
    private float sideC;
    private double Ax;
    private double Ay;
    private double Bx;
    private double By;
    private double Cx;
    private double Cy;

    /**
     * Конструктор треугольника с координатами
     */
    public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
        Ax = ax;
        Ay = ay;
        Bx = bx;
        By = by;
        Cx = cx;
        Cy = cy;
    }

    /**
     * Получение периметра
     */
    public static double getPerimeter(Triangle triangle) {
        triangle.sideA = (float) sqrt(pow(triangle.Bx - triangle.Ax, 2) + pow(triangle.By - triangle.Ay, 2));
        triangle.sideB = (float) sqrt(pow(triangle.Cx - triangle.Bx, 2) + pow(triangle.Cy - triangle.By, 2));
        triangle.sideC = (float) sqrt(pow(triangle.Cx - triangle.Ax, 2) + pow(triangle.Cy - triangle.Ay, 2));

        return triangle.sideA + triangle.sideB + triangle.sideC;
    }

    /**
     * Вычисление площади по полупериметру
     */
    public static double calcS(Triangle triangle) {
        double halfP = (triangle.sideA + triangle.sideB + triangle.sideC) / 2;
        return (Math.sqrt(halfP * (halfP - triangle.sideA) * (halfP - triangle.sideB) * (halfP - triangle.sideC)));
    }

    /**
     * Нахождение точки пересечения медиан по координатам
     */
    public static double[] getMedianIntersect(Triangle triangle) {
        double m1 = (triangle.Ax + triangle.Bx + triangle.Cx) / 3;
        double m2 = (triangle.Ay + triangle.By + triangle.Cy) / 3;
        return new double[]{m1, m2};
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle(0, 0, 3, 0, 3, 4);
        System.out.println("perimeter is " + getPerimeter(triangle));
        System.out.println("area is " + calcS(triangle));
        System.out.println(Arrays.toString(getMedianIntersect(triangle)));
    }
}
