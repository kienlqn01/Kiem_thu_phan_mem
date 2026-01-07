import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;

public class StudentAnalyzerTest {

    @Test
    public void testCountExcellentStudents() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // Trường hợp bình thường: điểm hợp lệ và không hợp lệ
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));

        // Toàn bộ điểm hợp lệ
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(10.0, 8.0, 9.5)));

        // Trường hợp biên: danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));

        // Trường hợp biên: chỉ có 0 hoặc 10
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(0.0, 10.0, 0.0)));

        // Trường hợp ngoại lệ: điểm <0 hoặc >10
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(-5.0, 8.0, 12.0)));
    }

    @Test
    public void testCalculateValidAverage() {
        StudentAnalyzer analyzer = new StudentAnalyzer();

        // Trường hợp bình thường: điểm hợp lệ và không hợp lệ
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);

        // Toàn bộ điểm hợp lệ
        assertEquals(9.17, analyzer.calculateValidAverage(Arrays.asList(10.0, 8.0, 9.5)), 0.01);

        // Trường hợp biên: danh sách rỗng
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);

        // Trường hợp biên: chỉ có 0 hoặc 10
        assertEquals(3.33, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0, 0.0)), 0.01);

        // Trường hợp ngoại lệ: điểm <0 hoặc >10
        assertEquals(8.0, analyzer.calculateValidAverage(Arrays.asList(-5.0, 8.0, 12.0)), 0.01);
    }
}
