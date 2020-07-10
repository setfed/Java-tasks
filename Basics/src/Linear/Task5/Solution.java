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
        reader.close();

        //Подсчет
        int hours = input/3600;
        int minutes = (input%3600)/60;
        int seconds = ((input%3600)%60);

        //Вывод
        System.out.printf("%dч %dмин %dс", hours, minutes, seconds);
    }
}

