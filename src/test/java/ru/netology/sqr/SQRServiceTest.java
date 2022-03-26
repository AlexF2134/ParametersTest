package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void shouldCalculate() {
        SQRService service = new SQRService();
        int expected = 10;
        int actual = service.calculate(100);
        Assertions.assertEquals(expected, actual);
    }
}