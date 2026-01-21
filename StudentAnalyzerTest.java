package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    @Test
    void testCalculateAverage_ValidScores() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        int[] scores = {6, 8, 10};

        double avg = analyzer.calculateAverage(scores);

        assertEquals(8.0, avg);
    }

    @Test
    void testCalculateAverage_EmptyArray() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        int[] scores = {};

        assertThrows(IllegalArgumentException.class, () -> {
            analyzer.calculateAverage(scores);
        });
    }

    @Test
    void testClassify_Gioi() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        String result = analyzer.classify(8.5);

        assertEquals("Giỏi", result);
    }

    @Test
    void testClassify_TrungBinh() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        String result = analyzer.classify(5.5);

        assertEquals("Trung bình", result);
    }
}
