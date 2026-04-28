package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp tiện ích toán học.
 */
public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    /**
     * Tính giai thừa của một số nguyên dương.
     *
     * @param n số nguyên dương
     * @return giai thừa của n
     * @throws IllegalArgumentException nếu n < 0
     */
    public static long factorial(int n) {
        if (n < 0) {
            logger.error("Tham số không hợp lệ: {}", n);
            throw new IllegalArgumentException("n phải >= 0");
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            logger.debug("i={}, result={}", i, result);
        }
        logger.info("Giai thừa của {} là {}", n, result);
        return result;
    }
}

