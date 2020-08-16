package StringsAsChars.Task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String string = new String("tdfguy23i1ryugh1j23kiu1231gy234h1jk");

        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(string);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println("Количество цифр " + count);
    }
}
