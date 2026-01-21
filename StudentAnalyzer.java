package org.example;

public class StudentAnalyzer {

    public double average(int[] scores) {
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        return (double) sum / scores.length;
    }

    public int max(int[] scores) {
        int max = scores[0];
        for (int s : scores) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }
}
