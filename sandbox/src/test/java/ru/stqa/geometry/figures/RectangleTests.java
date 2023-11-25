package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {
    @Test
    void cannotCreateRectangleWithNegativeSide() {
        try {
            new Rectangle(-5.0, 3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void testEquality() {
        var r1 = new Rectangle(4.0, 6.0);
        var r2 = new Rectangle(4.0, 6.0);
        Assertions.assertEquals(r1, r2);
    }

    @Test
    void testEquality2() {
        var r1 = new Rectangle(6.0, 4.0);
        var r2 = new Rectangle(4.0, 6.0);
        Assertions.assertEquals(r1, r2);
    }

    @Test
    void rectangleCompareTest() {
        var r1 = new Rectangle(2.0, 5.0);
        var r2 = new Rectangle(5.0, 2.0);
        Assertions.assertTrue(r1.equals(r2));
    }
}
