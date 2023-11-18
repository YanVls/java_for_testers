package ru.stqa.geometry.figures;

public class Triangle {
    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double area(double a, double b, double c) {
        double p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
