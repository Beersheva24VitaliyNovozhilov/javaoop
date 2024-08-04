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
        shapes = ArraysUtils.insertSorted(shapes, shapes.length, shape);
    }

    /**
     * Counts the number of shapes on the canvas, including shapes nested within
     * other canvases.
     *
     * @return the total number of shapes on the canvas
     */
    public int countShapes() {
        int count = 0;

        for (Shape shape : shapes) {
            count++;

            if (shape instanceof Canvas) {
                count += ((Canvas) shape).countShapes();
            }
        }

        return count;
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
