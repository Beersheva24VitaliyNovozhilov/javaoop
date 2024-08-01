package io.p4r53c.telran;

/**
 * This interface defines the methods for a shape. A shape is an object that has
 * a perimeter and a square.
 * 
 * @author p4r53c
 *
 */
public interface Shape {

    /**
     * Calculates the perimeter of the shape.
     * 
     * @return the perimeter of the shape
     */
    int perimeter();
    
    /**
     * Calculates the square of the shape.
     * 
     * @return the square of the shape
     */
    int square();
    
}
