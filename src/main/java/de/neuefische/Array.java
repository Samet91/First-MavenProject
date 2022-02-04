package de.neuefische;

public class Array {

    public static String[] fillArray(int numberOfStudent) {
        String[] arrayStudent = new String[numberOfStudent];
        for (int i = 0; i < numberOfStudent; i++)
            arrayStudent[i] = "Student " + i;
        return arrayStudent;
    }
}
