package com.blockwit.learn1.mrserg86;

    public class ExtTask1 {

        public static void main(String[] args) {

            WordsHelper wordsHelper = new WordsHelper();
            for(int i = 1; i <= 1000; i++) {
                System.out.println(i +" " + wordsHelper.printRubleWord(i));
            }

        }

    }
