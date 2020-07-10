package Cycles.Task4;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ONE;

        for (double i = 1; i <= 200; i++) {
            BigInteger pow = BigInteger.valueOf((long) Math.pow(i, 2));
            sum = sum.multiply(pow);
        }
        System.out.println(sum);
    }
}
