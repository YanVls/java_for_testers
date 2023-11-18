package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    //double perimeter = Triangle.perimeter(3, 4, 5)
    @Test
    public void canCalculatePerimeter() {
        Assertions.assertEquals(12.0, Triangle.perimeter(3, 4, 5));
    }

    @Test
    void canCalculateArea() {
        Assertions.assertEquals(6, Triangle.area(3, 4, 5));
    }
}
