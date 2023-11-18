package ru.stqa.geometry.figures;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double perimeter() {
        return this.sideA +this.sideB +this.sideC;
    }

    public double area() {
        double p = 0.5 * (this.sideA +this.sideB +this.sideC);
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }
}
