package StringAsObject.Task8;

public class Solution {
    public static void main(String[] args) {
        String string = "some string with whitespaces ";

        String[] strings = string.split(" ");

        String longest = "";

        for (String s : strings
        ) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        System.out.println(longest);
    }


}
