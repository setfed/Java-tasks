package Decomposition.Task7;

public class Solution {
    public static void main(String[] args) {
        System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна " + factorialOddOneToNine());
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static int factorialOddOneToNine() {
        int sum = 0;
        for (int i = 1; i < 10; ++i) {
            if (i % 2 == 1)
                sum += factorial(i);
        }
        return sum;
    }

}
