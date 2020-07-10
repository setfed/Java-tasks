package Cycles.Task3;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;

        for (double i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }

        System.out.println(sum);
    }
}
