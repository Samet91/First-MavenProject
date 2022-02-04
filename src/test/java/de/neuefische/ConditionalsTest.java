package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConditionalsTest {

    @Test
    void shouldWarnTooManyPeople() {
        assertEquals("zu viele Personen", Conditionals.peopleCheck(66, "gelb"));
    }

    @Test
    void shouldNotWarnLess30People() {
        assertEquals("Maximale Personenanzahl nicht überschritten", Conditionals.peopleCheck(19, "gelb"));
    }

    @Test
    void shouldNotWarnIfPersonLess15(){

    //given
    int person = 7;
    String alarmstufe = "gelb";
    //when
     String check = Conditionals.peopleCheck(person, alarmstufe);
    //then
        assertEquals("Maximale Personenanzahl nicht überschritten",check );
    }

}