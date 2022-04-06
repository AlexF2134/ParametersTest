package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {

    @Test
    void shouldCalculate() {
        SQRService service = new SQRService();
        int expected = 15;
        int actual = service.calculate(15);
        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    void shouldCount() {
//        SQRService service = new SQRService();
//        int expected = 3;
//        int actual = service.calculate(3);
//        Assertions.assertEquals(expected, actual);
//    }

}