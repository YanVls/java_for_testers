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

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try{
            new Triangle(-4.0,3.0,5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void cannotCreateTriangleWithTooBigSide() {
        try{
            new Triangle(12.0,3.0,4.0);
            Assertions.fail();
    } catch(IllegalArgumentException exception) {
            //OK
        }
        }

}
