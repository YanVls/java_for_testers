package ru.stqa.geometry.figures;

public record Triangle(
        double sideA,
        double sideB,
        double sideC
) {

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double area() {
        double p = 0.5 * (this.sideA + this.sideB + this.sideC);
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }
}
