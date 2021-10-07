package ru.netology.sqr;

public class SQRService {

    public int calculateSquareNumber(int lowNumber, int highNumber) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if ((lowNumber <= i * i) && (i * i <= highNumber)) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}

