package org.example;

public class Main {
    public static void main(String[] args) {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        int[] scores = {8, 7, 9, 6, 10};

        System.out.println("Average score = " + analyzer.average(scores));
        System.out.println("Max score = " + analyzer.max(scores));
    }
}
