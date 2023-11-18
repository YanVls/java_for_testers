package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    public void canCalculatePerimeter() {
        Assertions.assertEquals(12.0, new Triangle(3,4,5).perimeter());
    }

    @Test
    void canCalculateArea() {
        Assertions.assertEquals(6, new Triangle(3,4,5).area());
    }
}
