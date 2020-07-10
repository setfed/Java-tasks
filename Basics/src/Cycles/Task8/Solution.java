package Cycles.Task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите числа через пробел");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");
        reader.close();

        HashSet<Character> firstSet = addToSet(input[0].toCharArray());
        HashSet<Character> secondSet = addToSet(input[1].toCharArray());

        System.out.print("В обоих числах есть цифры: ");
        for (Character i : firstSet
        ) {
            for (Character j : secondSet
            ) {
                if (i.equals(j)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static HashSet<Character> addToSet(char[] chars) {
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
        }

        return set;
    }
}