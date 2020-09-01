package Aggregation.Task1;

public class TextRunner {
    public static void main(String[] args) {
        Word word = new Word("Заголовок");
        Text text = new Text(word);

        Word word1 = new Word("Какой-то");
        Word word2 = new Word("текст");
        Word word3 = new Word("в");
        Word word4 = new Word("теле");

        Sentence sentence = new Sentence();
        sentence.addWord(word1);
        sentence.addWord(word2);
        sentence.addWord(word3);
        sentence.addWord(word4);

        text.addBody(sentence);

        System.out.println("Head: " + text.getHeader());
        System.out.println("Body: " + text.getBody().trim());
    }
}
