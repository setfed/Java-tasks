package Branching.Task5;

import static java.lang.Math.pow;
import static java.lang.Math.random;

public class Solution {
    public static void main(String[] args) {
        double F;
        double x = random()* 20 - 10;
        System.out.println("x generated as " + x);

        if (x <= 3) {
            F = pow(x, 2) - (3 * x) + 9;
            System.out.println("F equals " + F);
        } else if (x > 3) {
            F = 1 / (pow(x, 3) + 6);
            System.out.println("F equals " + F);
        }
    }
}
