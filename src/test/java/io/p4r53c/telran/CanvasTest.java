package io.p4r53c.telran;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CanvasTest {

    private Canvas canvas;
    private Canvas canvasOfCanvas;

    @BeforeEach
    void setUp() {
        canvas = new Canvas();
        canvasOfCanvas = new Canvas();
    }

    @Test
    void testEmptyCanvas() {
        assertEquals(0, canvas.perimeter());
    }

    @Test
    void testPerimeterSingleShape() {

        canvas.addShape(new Rectangle(10, 5));
        assertEquals(30, canvas.perimeter());
    }

    @Test
    void testPerimeterRectangleShapes() {
        canvas.addShape(new Rectangle(10, 5));
        canvas.addShape(new Rectangle(25, 10));
        assertEquals(100, canvas.perimeter());
    }

    @Test
    void testPerimeterMultipleShapes() {
        canvas.addShape(new Rectangle(10, 5));
        canvas.addShape(new Square(6));
        assertEquals(54, canvas.perimeter());
    }

    @Test
    void testSquareSingleShape() {
        canvas.addShape(new Rectangle(10, 5));
        assertEquals(50, canvas.square());
    }

    @Test
    void testSquareMultipleShapes() {
        canvas.addShape(new Rectangle(10, 5));
        canvas.addShape(new Square(6));
        assertEquals(86, canvas.square());
    }

    @Test

    void testCanvasOfCanvas() {
        canvas.addShape(new Rectangle(10, 5));
        canvas.addShape(new Square(6));

        assertEquals(86, canvas.square());
        
        canvasOfCanvas.addShape(new Rectangle(10, 5));
        canvasOfCanvas.addShape(new Rectangle(10, 5));

        canvas.addShape(canvasOfCanvas);
        assertEquals(86 + 100, canvas.square());
    }
}
