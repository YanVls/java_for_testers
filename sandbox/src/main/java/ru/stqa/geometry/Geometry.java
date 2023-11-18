package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquare(new Square(6.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(8.0, 12.0);
    }

}
