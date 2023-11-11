package ru.stqa.geometry.figures;

public class Square {
    public static void printSquare(double side) {
        String text = String.format("Площадь квадрата со стороной %f  =  %f", side, squareArea(side));
        System.out.println(text);
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
