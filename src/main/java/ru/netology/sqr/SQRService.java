package ru.netology.sqr;

import static java.lang.Math.pow;

public class SQRService {
    public int calcSQRWithinRange(int startValue, int finalValue) {
        int quantity = 0;
        int numb = 10;
        int numbFin = 99;
        for (int i = numb; i <= numbFin; i++) {
            int numbSquared = (int) Math.pow(i, 2);
            if (numbSquared >= startValue && numbSquared <= finalValue) {
                quantity++;
            }
        }
        return quantity;
    }
}
