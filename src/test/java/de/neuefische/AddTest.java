package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    @Test
    void shouldBeGreatherZero() {
        int number1 = 3;
        int number2 = 5;

        boolean result = Add.plus(number1, number2) > 0;
        Assertions.assertTrue(result);
    }

    @Test
    void shouldBeSmallerZero() {
        int number1 = 3;
        int number2 = -5;

        boolean result = Add.plus(number1, number2) < 0;
        Assertions.assertTrue(result);
    }

    @Test
    void shouldAddTwoNegativeNumbers() {
        // given
        var number1 = -5;
        var number2 = -4;

        // when
        int result = Add.plus(number1, number2);

        // then
        assertEquals(-9, result);
    }
    @Test
    void shouldAddNegativeAndPositiveNumber() {
        var number1 = -7;
        var number2 = -3;

        int result = Add.plus(number1, number2);

        assertEquals(-10, result);
    }
}

