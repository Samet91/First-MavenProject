package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void shouldArrayFill(){

        String[] equal = Array.fillArray(5);
        assertArrayEquals(new String[] {"Student 0", "Student 1", "Student 2", "Student 3", "Student 4"}, equal);
    }

    @Test
    void shouldArrayEmpty(){

        String[] equal = Array.fillArray(0);
        assertArrayEquals(new String[] {}, equal);
    }
}