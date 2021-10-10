package com.company;

import java.util.ArrayList;

public class DictionaryCommandline {
    DictionaryManagement dictionaryManagement = new DictionaryManagement();
    public DictionaryCommandline() {
    }

    public void dictionaryBasic() {
        ArrayList<Word> wordArrayList = new ArrayList<Word>();
        Word newWord = dictionaryManagement.insertFromCommandline();
        wordArrayList.add(newWord);
        dictionaryManagement.showAllWords();
    }

    /**
     * 
     */
    public void dictionaryAdvanced() {
        dictionaryManagement.insertFromFile("dictionaries.txt");
        dictionaryManagement.showAllWords();
    }
}
