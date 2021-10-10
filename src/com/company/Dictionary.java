package com.company;

import java.util.ArrayList;

public class Dictionary {
    private int wordsSize;
    ArrayList<Word> dictionary = new ArrayList<Word>();
    Word[] word = new Word[10000];
    public Dictionary() {
        this.wordsSize = 0;
    }
    public void addWords(String staget, String explain){
        Word newWord = new Word(staget,explain);
        word[wordsSize] = newWord;
        wordsSize++;
        dictionary.add(newWord);
    }
    public int getWordsSize(){
        return this.wordsSize;
    }

}
