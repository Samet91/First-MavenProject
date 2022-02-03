package de.neuefische;

public class Fakultät {

    public static void main(String[] args) {
        createFakultät(5);
    }

    public static int createFakultät(int zahl) {
        int fakultät = 1;
        int i = 1;
        while (i <= zahl) {
            fakultät *= i;
            i++;
        }
        return fakultät;

    }
}
