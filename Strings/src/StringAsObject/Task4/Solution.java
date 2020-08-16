package StringAsObject.Task4;

public class Solution {
    public static void main(String[] args) {
        char[] chars = "Информатика".toCharArray();

        //Копирование членов массива в отдельные переменные
        char char1 = chars[7];
        char char2 = chars[3];
        char char3 = chars[4];
        char char4 = chars[7];

        //Конкатенация значений переменных
        System.out.println(char1 + "" + char2 + "" + char3 + "" + char4);
    }
}
