package com.company;

import java.util.ArrayList;

public class DictionaryCommandline {
    public DictionaryCommandline() {
    }

    public void dictionaryBasic(){
        ArrayList<Word> wordArrayList = new ArrayList<Word>();
        DictionaryManagement dictionaryManagement = new DictionaryManagement();
        Word newWord = dictionaryManagement.insertFromCommandline();
        wordArrayList.add(newWord);
        dictionaryManagement.showAllWords(wordArrayList);
    }
}
