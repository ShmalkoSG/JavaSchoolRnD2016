package ru.sbertech.test.Lesson3.HomeWork;

/**
 * Created by svetlanashmalko on 20.07.16.
 */
public class Slovo {
    public Slovo(String word,int wordLength){
        this.word=word;
        this.wordLength=wordLength;
    }
    public void setWord(String word) {
        this.word = word;
    }

    public void setWordLength(int wordLength) {
        this.wordLength = wordLength;
    }

    String word;

    public int getWordLength() {
        return wordLength;
    }

    public String getWord() {
        return word;
    }

    int wordLength ;


}
