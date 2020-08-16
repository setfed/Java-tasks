package StringsAsChars.Task5;

public class Solution {
    public static void main(String[] args) {
        String string = ("   Some  stuff  is written here  ");

        String replace = string.trim().replaceAll(" +", " ");

        System.out.println(replace);

    }
}
