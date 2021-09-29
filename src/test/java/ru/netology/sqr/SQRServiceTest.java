package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void calculatesquarenumber() {
        SQRService sqrService = new SQRService();
        int lowNumber = 200;
        int highNumber = 300;
        int expected = 3;
        int actual = sqrService.calculatesquarenumber(lowNumber, highNumber);
        assertEquals(expected, actual);
    }
        }