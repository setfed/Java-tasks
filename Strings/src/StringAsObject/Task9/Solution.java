package StringAsObject.Task9;

public class Solution {
    public static void main(String[] args) {
        String input = "Some words WITH different sizes LeTeRs";
        int countLowercase = 0;
        int countUppercase = 0;

        for (char c: input.toCharArray()
             ) {
            if (Character.isUpperCase(c)) {
                countUppercase++;
            } else if (Character.isLowerCase(c)) {
                countLowercase++;
            }
        }

        System.out.printf("Строчных букв %s, прописных букв %s",countLowercase, countUppercase);
    }
}
