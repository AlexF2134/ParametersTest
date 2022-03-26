package ru.netology.sqr;

public class SQRService {

    public int calculate(int num) {
         num = 100;
            for (int i = 10; i >= 10 && i <= 99; i++) {
            if (i * i >= num) {
                return i;
            }
        }
        return 0;
    }
}