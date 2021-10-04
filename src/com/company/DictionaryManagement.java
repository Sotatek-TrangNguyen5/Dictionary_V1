package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    public DictionaryManagement() {
    }

    Scanner myObj  = new Scanner(System.in);
    public Word insertFromCommandline(){
        System.out.println("Enter new word: ");
        String word = myObj.nextLine();
        System.out.println("Enter word mean: ");
        String mean = myObj.nextLine();
        Word newWord = new Word(word,mean);
        return newWord;
    }
    public void showAllWords(ArrayList<Word> wordArrayList){
        System.out.println("No | English            |Vietnamese");
        for (int i = 0; i < wordArrayList.size(); i++) {
            System.out.println(Integer.toString(i+1)+"  |"+ wordArrayList.get(0).getWord_target()+"            |"+wordArrayList.get(0).getWord_explain());
        }
    }
}
