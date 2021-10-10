package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary = new Dictionary();
    public DictionaryManagement() {
    }

    Scanner myObj = new Scanner(System.in);

    public Word insertFromCommandline() {
        System.out.println("Enter new word: ");
        String word = myObj.nextLine();
        System.out.println("Enter word mean: ");
        String mean = myObj.nextLine();
        Word newWord = new Word(word, mean);
        return newWord;
    }

    public void showAllWords() {
        System.out.println("No | English            |Vietnamese");
        for (int i = 0; i < dictionary.getWordsSize(); i++) {
            System.out.println(Integer.toString(i + 1) + "  |" + dictionary.word[i].getWord_target() + "            |" + dictionary.word[i].getWord_explain());
        }
    }

    /**
     * this is insert from file
     *
     * @return
     */

    public void insertFromFile(String fileName){

        File filein = new File(fileName);
        try {
            Scanner sc = new Scanner(filein);
            while(sc.hasNextLine()){
                String word = sc.next();
                String mean = sc.next();
                System.out.println(word);
                dictionary.addWords(word,mean);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * this is dictionary Lookup
     */
    public void dictionaryLookup() {

    }


    public void showAllWords(Dictionary dictionary) {
    }
}
