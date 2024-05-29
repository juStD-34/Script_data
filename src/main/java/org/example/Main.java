package org.example;

import genDataset.genDataset;
public class Main {
    public static void main(String[] args) {
        String ouputFile ="src/main/java/results/test.json";
        String inputFolderPath = "src/main/java/news_page";
        genDataset.generateTest (inputFolderPath, ouputFile);
        System.out.println ("Hello world!");
    }
}