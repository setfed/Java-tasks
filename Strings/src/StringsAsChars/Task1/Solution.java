package StringsAsChars.Task1;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("someFunc");
        strings.add("addSomethingUsefulStuff");
        strings.add("doRandom");

        String regex = "([a-z])([A-Z]+)";
        String replacement = "$1_$2";

        for (String s : strings
        ) {
            System.out.println(s
                    .replaceAll(regex, replacement)
                    .toLowerCase());

        }
    }
}
    


