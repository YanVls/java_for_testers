package ru.stqa.geometry.figures;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(triangle.sideA, this.sideA) == 0 && Double.compare(triangle.sideB, this.sideB) == 0 && Double.compare(triangle.sideC, this.sideC) == 0)
                || (Double.compare(triangle.sideA, this.sideB) == 0 && Double.compare(triangle.sideB, this.sideC) == 0 && Double.compare(triangle.sideC, this.sideA) == 0)
                || (Double.compare(triangle.sideA, this.sideC) == 0 && Double.compare(triangle.sideB, this.sideA) == 0 && Double.compare(triangle.sideC, this.sideB)==0)
                || (Double.compare(triangle.sideA, this.sideA) == 0 && Double.compare(triangle.sideB, this.sideC) == 0 && Double.compare(triangle.sideC, this.sideB) == 0)
                || (Double.compare(triangle.sideA, this.sideC) == 0 && Double.compare(triangle.sideB, this.sideB) == 0 && Double.compare(triangle.sideC, this.sideA) == 0)
                || (Double.compare(triangle.sideA, this.sideB) == 0 && Double.compare(triangle.sideB, this.sideA) == 0 && Double.compare(triangle.sideC, this.sideC) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
