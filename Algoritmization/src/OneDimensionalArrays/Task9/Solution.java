package OneDimensionalArrays.Task9;

import OneDimensionalArrays.Utilities;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите желаемый размер массива");

        //Получаем размер массива
        String input = reader.readLine();
        int arraySize = Integer.parseInt(input);
        int[] array = new int[arraySize];
        reader.close();

        Utilities.generateRandomNums(array);
        Map<Integer, Integer> countArray = new HashMap<>();


        for (int i : array
        ) {
            countArray.merge(i, 1, (a, b) -> a + b);
        }


        Iterator iterator = countArray.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            int max = 0;

            System.out.println("Key: " + me.getKey() + " Value: " + me.getValue());
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : countArray.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;


            }
        }
        System.out.println("Самое часто встречающееся число " + maxEntry.getKey() + " c " + maxEntry.getValue() + " повторениями");
    }
}
