package Linear.Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите координаты для проверки");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Трансформируем для работы
        String[] input = reader.readLine().split(" ");

        Integer x = Integer.parseInt(input[0]);
        Integer y = Integer.parseInt(input[1]);
        reader.close();


        if (x >= -2 && x <= 2 && y >= -3 && y <= 4 ||
                x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
