package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRserviceTest {

    @Test
    void shouldCalculateForRandom() {
        SQRservice service = new SQRservice();

        int lowerLimit = 200;
        int upperLimit = 300;
        int expected = 3;
        int actualCount = service.numberSquares(lowerLimit, upperLimit);
        assertEquals(expected, actualCount);
    }
}
