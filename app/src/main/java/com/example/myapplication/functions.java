package com.example.myapplication;

public class functions {

    public static int countWords(String str)
    {
        if (str == null || str.isEmpty())
            return 0;

        String[] words = str.split("\\s+");
        return words.length;
    }

    public static int spellingCharCounter(String text){

    return 0;
    }

    public static int charCounter (String str) {
        //Stores the count of punctuation marks
        int countPuncMarks = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
                countPuncMarks++;
            }
        }
        return countPuncMarks;
    }

}
