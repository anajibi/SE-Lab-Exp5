package me.alinajibi.tdd;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) throws InvalidDimensionException {
        if (length <= 0 || width <= 0) {
            throw new InvalidDimensionException("Invalid dimension");
        }
        this.length = length;
        this.width = width;
    }

    public int computeArea() {
        return length * width;
    }

    public void setWidth(int width) throws InvalidDimensionException {
        if (width <= 0) {
            throw new InvalidDimensionException("Invalid dimension");
        }
        this.width = width;
    }

    public void setHeight(int height) throws InvalidDimensionException {
        if (height <= 0) {
            throw new InvalidDimensionException("Invalid dimension");
        }
        this.length = height;
    }
}
