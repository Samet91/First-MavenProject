package de.neuefische;

public class Fakultät {

    public static void main(String[] args) {
        createFakultät(5);
    }

    public static int createFakultät(int zahl) {
        int fakultät = 1;
        for (int i = 1; i <= zahl; i++) {
            fakultät *= i;
        }
        return fakultät;

    }
}
