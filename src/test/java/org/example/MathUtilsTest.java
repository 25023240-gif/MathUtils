package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testFactorialPositive() {
        assertEquals(120, MathUtils.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, MathUtils.factorial(0));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> MathUtils.factorial(-1));
    }
}
