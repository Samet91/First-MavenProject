package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionalsTest {

    @Test
    void shouldWarnTooManyPeople() {
        assertEquals("zu viele Personen", Conditionals.peopleCheck(31, "gelb"));
    }

    @Test
    void shouldNotWarnLess30People() {
        assertEquals("Maximale Personenanzahl nicht überschritten", Conditionals.peopleCheck(19, "gelb"));
    }
}