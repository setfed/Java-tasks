package StringsAsChars.Task2;

public class Solution {

    public static void main(String[] args) {
        String string =new String("word word word some stuff");

        String replace =string.toLowerCase().replace("word", "letter");

        System.out.println(replace);
    }
}
