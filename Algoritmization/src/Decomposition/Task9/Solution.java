package Decomposition.Task9;

import javax.imageio.ImageTranscoder;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double X, Y, Z, T;
            do {
                System.out.println("Укажите длины стороны четырехугольника X,Y,Z,T:");
                X = sc.nextDouble();
                Y = sc.nextDouble();
                Z = sc.nextDouble();
                T = sc.nextDouble();
            } while (X < 1 || Y < 1 || Z < 1 || T < 1);
            sc.close();

            if (quadrangle(X, Y, Z, T))
                System.out.println("Четырехуголькник существует");
            else {
                System.out.println("Четырехуголькник не существует");
                return;

            }
            double areaQandrangle = areaRigthTriangle(X, Y) + areaSimpleTriangleTwoCorners(hypotenuseRightTriangle(X, Y), Z, T);
            System.out.println(areaQandrangle);

        } catch (InputMismatchException e) {
            System.out.println("Неверный ввод");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean quadrangle(double x, double y, double z, double t) {
        double max1 = x, max2 = z, max;
        if (x < y)
            max1 = y;
        if (z < t)
            max2 = t;
        if (max1 < max2)
            max = max2;
        else max = max1;
        double hyp = hypotenuseRightTriangle(x, y);
        if (max < x + y + z + t - max && hyp + z > t && hyp + t > z && z + t > hyp)
            return true;
        else return false;
    }

    public static double areaRigthTriangle(double x, double y) {
        return x * y / 2;
    }

    public static double hypotenuseRightTriangle(double x, double y) {
        return Math.sqrt(x * x + y * y);

    }

    public static double areaSimpleTriangleTwoCorners(double x, double z, double t) { // принимает значения длин сторон между которыми угол 90 градусов
        double cornerA = Math.acos((x * x + z * z - t * t) / (2 * x * z));
        double cornerB = Math.acos((x * x + t * t - z * z) / (2 * x * t));
        double area = (x * x / 2) * (Math.sin(cornerA) * Math.sin(cornerB) / Math.sin(cornerA + cornerB));
        return area;
    }
}
