package com.company;

public class DictionaryCommandline {
    DictionaryManagement dictionaryManagement = new DictionaryManagement();

    public DictionaryCommandline() {
    }

    public void dictionaryBasic() {
        dictionaryManagement.insertFromCommandline();
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
