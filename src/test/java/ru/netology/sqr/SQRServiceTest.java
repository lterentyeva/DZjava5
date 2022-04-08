package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void calculate() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 400);
        int expected = 6;

        assertEquals(expected, actual);

    }
}