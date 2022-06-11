# Домашнее задание к занятию "Циклы, параметризованные тесты и аннотации (часть 1)"
package ru.netology.sqr;

public class SQRService {

    public int mult(int minValue, int maxValue) {
        int num = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= minValue && square <= maxValue) {
                num++;
            }
        }
        return (num);
    }
}
