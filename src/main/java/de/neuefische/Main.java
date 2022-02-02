package de.neuefische;

public class Main {
    public static void main(String[] args) {

        System.out.println(check("Hi"));
        System.out.println(check("Hallo ziemlich langer String"));
        System.out.println(check("Hallo ziemlich langer fancy String"));
    }

    public static boolean check(String s) {
        return s.length() > 20 && s.contains("fancy");
    }
}
