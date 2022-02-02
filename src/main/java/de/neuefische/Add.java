package de.neuefische;

public class Add {

    public static void main(String[] args) {
        printSum(plus(7, 17));
        contain("wort");
    }



    public static int plus(int number1, int number2) {
        return number1 + number2;
    }

    public static void printSum(int sum) {
        System.out.println("Summe: " + sum + "\n");
    }

    public static void contain(String word) {
        word = "Wie lange ist die Kette";
    }
}

