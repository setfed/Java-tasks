package Linear.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        //Принимаем от пользователя количество секунд
        System.out.println("Введите количество секунд для расчета");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Трансформируем для работы
        Integer input = Integer.parseInt(reader.readLine());

        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        //Подсчет
        while (input > 59) {
            minutes += 1;
            input -= 60;
            if (minutes > 59) {
                hours += 1;
                minutes = 0;
            }
        }
        seconds = input;

        //Вывод
        System.out.printf("%dч %dмин %dс", hours, minutes, seconds);
    }
}

