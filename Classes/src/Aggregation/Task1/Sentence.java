package Aggregation.Task1;

public class Sentence {
    private String sentence = "";

    public void addWord(Word word) {
        sentence += " " + word.getWord();
    }

    public String getSentence() {
        return sentence;
    }
}