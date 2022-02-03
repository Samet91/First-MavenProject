package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakultätTest {

    @Test
    void facultyZeroShouldBeOne() {
    //given
        int zahl = 0;
    //when
        int actual = Fakultät.createFakultät(zahl);
    //then
        assertEquals(1, actual);

    }

    @Test
    void facultyZeroShouldBe12() {
        //given
        int zahl = 12;
        //when
        int actual = Fakultät.createFakultät(zahl);
        //then
        assertEquals(479001600, actual);

    }

}