package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FibCalc {
    private Logger log = LogManager.getLogger();

    public long calc(long i) {
//        log.trace("Считаем число Фибоначчи: {}", i);
/*        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            log.error(e);
        }
        if (i < 0 || i > 50) throw new IllegalArgumentException("Мы не считаем значения меньше 0 или больше 50!");
        if (i == 0) return 0;
        if (i == 1) return 1;
        return calc(i - 1) + calc(i - 2);*/

        if (i == 0) return 0;
        else
        if (i == 1) return i;
        else
        if (i < 0) {
            int sign = i % 2 == 0 ? -1 : 1;
            return sign * calc(-i);}
        else {
            long a = 0;
            long b = 1;
            for (int j = 2; j <= i; ++j) {
                long next = a + b;
                a= b;
                b = next;
            }
            return b;
        }

    }
}
