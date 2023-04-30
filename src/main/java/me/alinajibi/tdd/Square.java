package me.alinajibi.tdd;

public class Square {
    private int side;

    public Square(int side) throws InvalidDimensionException {
        if (side <= 0) {
            throw new InvalidDimensionException("Invalid dimension");
        }
        this.side = side;
    }

    public int computeArea() {
        return side * side;
    }

    public void setSide(int side) throws InvalidDimensionException {
        if (side <= 0) {
            throw new InvalidDimensionException("Invalid dimension");
        }
        this.side = side;
    }
}
