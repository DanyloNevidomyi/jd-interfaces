package learning.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    @Test
    void testCircle() {
        Shape circle = new Circle(5.0);
        assertEquals(78.54, circle.calculateArea(), 0.01);
        assertEquals(31.42, circle.calculatePerimeter(), 0.01);
    }

    @Test
    void testRectangle() {
        Shape rectangle = new Rectangle(4.0, 6.0);
        assertEquals(24.0, rectangle.calculateArea(), 0.01);
        assertEquals(20.0, rectangle.calculatePerimeter(), 0.01);
    }

    @Test
    void testSquare() {
        Shape square = new Square(3.0);
        assertEquals(9.0, square.calculateArea(), 0.01);
        assertEquals(12.0, square.calculatePerimeter(), 0.01);
    }

    @Test
    void testTriangle() {
        Shape triangle = new Triangle(3.0, 4.0, 5.0);
        assertEquals(6.0, triangle.calculateArea(), 0.01);
        assertEquals(12.0, triangle.calculatePerimeter(), 0.01);
    }
}