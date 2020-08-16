package StringAsObject.Task10;

public class Solution {
    public static void main(String[] args) {
        String input = "Some lettes. Some words! And probably some questions?";

        int count = 0;
        for (Character c: input.toCharArray()
             ) {
            if (c.equals('.') || c.equals('!') || c.equals('?')) {
                count++;
            }
        }

        System.out.println("Количество предложений " + count);
    }
}
