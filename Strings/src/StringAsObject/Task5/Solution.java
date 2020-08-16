package StringAsObject.Task5;

public class Solution {
    public static void main(String[] args) {
        String string = "12345678w9esfgdvcxaaasfghudilxjvnkcaaasdasd";

        int count = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("Буква а встречается " + count + " раз");
    }
}

