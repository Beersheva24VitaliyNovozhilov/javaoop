package io.p4r53c.telran;

public class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the perimeter of a rectangle.
     *
     * @return the perimeter of the rectangle
     */
    @Override
    public int perimeter() {
        return 2 * (width + height);
    }

    /**
     * Calculates the square of the rectangle.
     *
     * @return the product of the width and height of the rectangle
     */
    @Override
    public int square() {
        return width * height;
    }

}
