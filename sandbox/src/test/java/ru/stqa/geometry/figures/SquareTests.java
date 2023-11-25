package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test
    void canCalculateArea() {
        var s = new Square(4.0);
        double actual = s.area();
        // Assertions.assertEquals(25, actual);
        if (actual != 25.0) {
            throw new AssertionError(String.format("Expected format %f , but was %f", 25.0, actual));
        }
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(20.0, new Square(5.0).perimeter());
    }

    @Test
    void cannotCreateSquareWithNegativeSide() {
        try {
            new Square(-5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }

    }
}