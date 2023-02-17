package ru.netology.sqr;

public class SqrService {
    public int CalcSqr(int minRange, int maxRange) {
        int result = 0;
        for (int i = 10; i <= 99; i++) {
            int iSqr = i * i;
            if (iSqr >= minRange) {
                if (iSqr <= maxRange) {
                    ;
                    result++;
                }

            }
        }
        return result;
    }

}
