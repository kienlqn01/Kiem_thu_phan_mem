package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    @Test
    void testCountExcellentStudents() {
        assertEquals(2,
                analyzer.countExcellentStudents(Arrays.asList(9.0, 8.0, 7.0)));
    }

    @Test
    void testCountExcellentStudentsWithInvalidScores() {
        assertEquals(1,
                analyzer.countExcellentStudents(Arrays.asList(9.0, -1.0, 15.0)));
    }

    @Test
    void testCountExcellentStudentsEmptyList() {
        assertEquals(0,
                analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    void testCalculateValidAverage() {
        assertEquals(8.0,
                analyzer.calculateValidAverage(Arrays.asList(6.0, 8.0, 10.0)));
    }

    @Test
    void testCalculateValidAverageAllInvalid() {
        assertEquals(0,
                analyzer.calculateValidAverage(Arrays.asList(-1.0, 20.0)));
    }
}
