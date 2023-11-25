package ru.stqa.geometry.figures;

public record Triangle(
        double sideA,
        double sideB,
        double sideC
) {

    public Triangle {
        if (sideA < 0 ||
                sideB < 0 ||
                sideC < 0 ||
                sideA + sideB < sideC ||
                sideB + sideC < sideA ||
                sideA + sideC < sideB
        ) {
            throw new IllegalArgumentException("Parameters of sides are not correct ( or negative or one of sides is too big");
        }
    }

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public double area() {
        double p = 0.5 * (this.sideA + this.sideB + this.sideC);
        return Math.sqrt(p * (p - this.sideA) * (p - this.sideB) * (p - this.sideC));
    }
}
