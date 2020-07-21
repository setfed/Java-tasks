package ArraysOfArrays.Task8;

import ArraysOfArrays.Utilities;
import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    private static Object NullPointerException;

    public static void main(String[] args) throws Throwable {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер матрицы и номера столбцов для замены значений через пробел");

        //Получаем размер генерируемого массива и номера столбцов для замены
        String[] input = reader.readLine().split(" ");

        int size = Integer.parseInt(input[0]);
        int column1 = Integer.parseInt(input[1]) - 1;
        int column2 = Integer.parseInt(input[2]) - 1;
        reader.close();

        int[][] array = Utilities.genMatrix(size);
        System.out.println("Была сгенерирована следующая матрица");
        Utilities.showMatrix(array);

        //Меняем местами столбцы
        if (column1 + 1 > size || column2 + 1 > size) {
            System.out.println("Нельзя заменить данные столбцы, они находятся за пределами матрицы");
            throw (Throwable) NullPointerException;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == column1) {
                    int temp = array[i][j];
                    array[i][j] = array[i][column2];
                    array[i][column2] = temp;
                }
            }
        }

        System.out.println("Теперь матрица имеет вид");
        System.out.printf("Были заменены столбцы №%d и №%d \n", column1 + 1, column2 + 1);
        Utilities.showMatrix(array);
    }
}
