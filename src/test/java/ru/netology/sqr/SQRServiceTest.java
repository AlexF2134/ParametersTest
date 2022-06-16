package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"range 0 - 150, 0, 150, 3",
            "range 200 - 300, 200, 300, 3",
            "range 150 - 500, 150, 500, 10"
    })
    void shouldMult(String testName, int minValue, int maxValue, int expected) {
        SQRService service = new SQRService();
        int actual = service.mult(minValue, maxValue);
        assertEquals(expected, actual);
    }
}


