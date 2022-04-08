package ru.netology.sqr;

public class SQRService {
    public int calculate(int lowerLimit, int upperLimit) {
        int j = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                j++;
            }
        }
        return j;
    }
}
