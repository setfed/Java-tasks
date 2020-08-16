package StringAsObject.Task1;

public class Solution {
    public static void main(String[] args) {
        char[] chars = "12312312sf         123    312   "
                .toCharArray();

        int pos = 0;
        int lon = 0;
        int tmpPos = 0;
        int tmpLon = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                if (tmpLon == 0) {
                    tmpPos = i;
                }

                tmpLon++;
            } else {
                if (tmpLon > lon) {
                    lon = tmpLon;
                    pos = tmpPos;
                }
                tmpLon = 0;
                tmpPos = 0;
            }
        }

        System.out.println("Самый длинный пробел начинается с позиции: " + pos + " Его длина равна: " + lon);
    }
}


