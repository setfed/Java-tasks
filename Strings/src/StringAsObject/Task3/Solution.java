package StringAsObject.Task3;

public class Solution {
    public static void main(String[] args) {
        String string = "казак";

        if (isPalindrome(string)) {
            System.out.printf("Слово %s является палиндромом", string);
        } else {
            System.out.printf("Слово %s не является палиндромом", string);
        }
    }

    public static Boolean isPalindrome(String s) {
        return s.equals((new StringBuilder(s)).reverse().toString());
    }
}
