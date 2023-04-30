package me.alinajibi.tdd;

public class Square extends Rectangle {

    public Square(int side) throws InvalidDimensionException {
        super(side, side);
    }

    public void setSide(int side) throws InvalidDimensionException {
        super.setWidth(side);
        super.setHeight(side);
    }

    public void setHeight(int height) throws InvalidDimensionException {
        super.setHeight(height);
        super.setWidth(height);
    }

    public void setWidth(int width) throws InvalidDimensionException {
        super.setWidth(width);
        super.setHeight(width);
    }
}
