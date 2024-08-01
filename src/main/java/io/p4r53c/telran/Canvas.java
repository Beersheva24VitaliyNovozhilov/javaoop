package io.p4r53c.telran;

import io.p4r53c.telran.utils.ArraysUtils;

/**
 * This class represents a canvas that can hold multiple shapes.
 * 
 * @author p4r53c
 *
 */
public class Canvas implements Shape {

    private Shape[] shapes;

    public Canvas() {
        shapes = new Shape[0];
    }

    /**
     * Adds a shape to the canvas.
     *
     * @param shape the shape to be added
     */
    public void addShape(Shape shape) {
        Shape[] newShapes = new Shape[shapes.length + 1];
        System.arraycopy(shapes, 0, newShapes, 0, shapes.length);

        newShapes[shapes.length] = shape;
        newShapes = ArraysUtils.insertSorted(shapes, newShapes.length - 1, shape);

        shapes = newShapes;
    }

    /**
     * Calculates the perimeter of the shapes held by the canvas.
     * 
     * @return the perimeter of the shapes
     */
    @Override
    public int perimeter() {
        int perimeter = 0;

        for (Shape shape : shapes) {
            perimeter += shape.perimeter();
        }

        return perimeter;
    }

    /**
     * Calculates the square of the shapes held by the canvas.
     * 
     * @return the square of the shapes
     */
    @Override
    public int square() {
        int square = 0;

        for (Shape shape : shapes) {
            square += shape.square();
        }

        return square;
    }

}
