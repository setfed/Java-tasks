package StringAsObject.Task7;

import java.util.LinkedHashSet;

public class Solution {
    public static void main(String[] args) {
        String input = "abc cde defdfs   ";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : input.toCharArray()
        ) {
            if (!Character.isWhitespace(c)) {
                set.add(c);
            }
        }

        for (Object c : set) {
            System.out.print(c);
        }
    }
}
