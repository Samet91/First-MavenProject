package de.neuefische;

public class Conditionals {

    public static String peopleCheck(int numberPeople) {
        if (numberPeople > 30) {
            return "zu viele Personen";
        }
        return "Maximale Personenanzahl nicht überschritten";
    }
}

