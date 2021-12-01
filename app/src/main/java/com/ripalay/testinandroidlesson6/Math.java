package com.ripalay.testinandroidlesson6;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    public String reverse(String words) {
        String[] splitedWords = {};
        String word = "";


        if (words.indexOf(",") != -1) {
            splitedWords = words.split(",");
            System.out.println(words.indexOf(","));
        } else if (words.indexOf("  ") != -1) {
            splitedWords = words.split("  ");
        } else {
            splitedWords = words.split(" ");
        }

        if (splitedWords.length > 2) {
            for (int i = splitedWords.length; i > 0; i--) {
                word = word + splitedWords[i - 1];
                if (i - 1 > 0) {
                    word = word + " ";
                }
            }
            return word;


        } else if (splitedWords.length == 1) {
            return "";


        } else {
            return splitedWords[1] + " " + splitedWords[0];
        }
    }

}
