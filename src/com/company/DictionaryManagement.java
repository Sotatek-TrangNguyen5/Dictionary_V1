package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dictionary = new Dictionary();

    public DictionaryManagement() {
    }

    public void insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        dictionary.setWordSize(n);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter your new Word " + i + 1 + " : ");
            String word = sc.next();
            System.out.print("Enter word mean " + i + 1 + ": ");
            String mean = sc.next();
            String c = sc.nextLine();
            dictionary.addWords(word, mean);
        }
    }

    public void showAllWords() {
        System.out.println("No \t| English \t \t \t \t \t|Vietnamese");
        for (int i = 0; i < dictionary.getWordsSize(); i++) {
            System.out.println(Integer.toString(i + 1) + " \t|" + dictionary.word[i].getWord_target() + " \t \t \t \t \t \t|" + dictionary.word[i].getWord_explain());
        }
    }

    /**
     * this is insert from file
     */

    public void insertFromFile(String fileName) {

        File filein = new File(fileName);
        try {
            Scanner sc = new Scanner(filein);
            while (sc.hasNextLine()) {
                String word = sc.next();
                String mean = sc.next();
                dictionary.addWords(word, mean);
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
}
