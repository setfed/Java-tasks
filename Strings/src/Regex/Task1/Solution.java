package Regex.Task1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//отсортировать абзацы  по  количеству  предложений;
// в каждом  предложении  отсортировать  слова  по  длине;
// отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
// а в случае равенства –по алфавиту.


public class Solution {
    public static void main(String[] args) {
        String input = "Абзац номер 1.Предложение оооп 2. И так далее.\n" +
                "Абакз номер 2, но по длинее. Который подлинее.\n" +
                "Абзац 3.asd.asd.asd.";

        System.out.println("1. Отсортировать абзацы по количеству предложений в них");
        System.out.println("2. Отсортировать предложения по длине слов в них");
        System.out.println("3. Отсортировать по количеству вхождений знака в лексемах");
        System.out.println("Введите номер желаемой операции");
        Scanner scanner = new Scanner(System.in);


        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                sortByNumberOfSentences(input);
            case 2:
                sortSentencesByWordsLength(input);
            case 3:
                System.out.println("Введите знак для поиска в строке");
                String toFind = scanner.next();
                sortByCountingCharInLexeme(input, toFind);
        }
        scanner.close();

    }

    public static void sortByNumberOfSentences(String input) {
        String[] paragraphs = input.split("\n");
        HashMap<String, Integer> sentences = new HashMap<>();

        int count = 0;

        for (String s : paragraphs
        ) {
            for (Character c : s.toCharArray()
            ) {
                if (c.equals('?') || c.equals('!') || c.equals('.')) {
                    count++;
                    sentences.put(s, count);
                }
            }
            count = 0;
        }

        sentences = sortByValue(sentences);
        printMap(sentences);

    }

    public static void sortSentencesByWordsLength(String input) {
        //not stable
        for (String paragraph : input.split("\n")
        ) {
            for (String sentence : paragraph.split("\\.")
            ) {
                String[] words = sentence.split(" ");
                Arrays.sort(words, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return o1.length() - o2.length();
                    }
                });

                StringBuilder newSentence = new StringBuilder();
                for (String s : words
                ) {
                    newSentence.append(s + " ");
                }
                String string = newSentence.toString().trim();

                System.out.print(string + ".");
            }
            System.out.println();
        }


    }

    public static void sortByCountingCharInLexeme(String input, String toFind) {


        for (String paragraph : input.split("\n")
        ) {
            for (String sentence : paragraph.split("\\.")
            ) {
                HashMap<String, Integer> set = new HashMap<>();
                String[] words = sentence.split(" ");
                for (int i = 0; i < words.length; i++) {
                    int count = 0;
                    Pattern pattern = Pattern.compile(toFind);
                    Matcher findChar = pattern.matcher(words[i]);
                    set.put(words[i], 0);

                    count = 0;
                    while (findChar.find()) {
                        count++;
                        set.put(words[i], count);
                    }

                    set = sortByValue(set);
                }
                StringBuilder newSentence = new StringBuilder();
                for (String s : set.keySet()
                ) {
                    newSentence.append(s + " ");
                }
                String string = newSentence.toString().trim();
                System.out.print(string + ".");
            }
            System.out.println();
        }
    }

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }

    private static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.printf("Строка \"%s\" имеет %d предложение/я\n", key, value));
    }
}
