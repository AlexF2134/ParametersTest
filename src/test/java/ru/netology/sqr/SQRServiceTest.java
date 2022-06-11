package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"range 200 - 300, 200, 300, 3"})
        //Диапазон 200 - 300, итоговое число совпадений 3

    void shouldMult(String testName, int minValue, int maxValue, int expected) {
        SQRService service = new SQRService();
        int actual = service.mult(minValue, maxValue);      //Вызов метода
        assertEquals(expected, actual);          //Выполняется проверка
    }
}


