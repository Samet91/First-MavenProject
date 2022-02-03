package de.neuefische;

public class Conditionals {

    public static String peopleCheck(int numberPeople, String alarmLevel) {
        switch (alarmLevel) {
            case "rot":
                return checkPersons(numberPeople, 0);
            case "gelb":
                return checkPersons(numberPeople, 30);
            case "grün":
                return checkPersons(numberPeople, 60);
            default:
                return "unknown Alarm";
        }
    }

    private static String checkPersons(int numberPeople, int maxNumberPeople) {
        if (numberPeople > maxNumberPeople) {
            return "zu viele Personen";
        }
        return "Maximale Personenanzahl nicht überschritten";
    }
}

