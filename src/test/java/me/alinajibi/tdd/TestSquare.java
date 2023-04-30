package me.alinajibi.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSquare {
    @Test
    public void testConstructor_3() throws InvalidDimensionException {
        new Square(1);
        try {
            new Square(-1);
        } catch (InvalidDimensionException e) {
            assertEquals("Invalid dimension", e.getMessage());
        }
    }

    @Test
    public void testComputeArea_3() throws InvalidDimensionException {
        Square square = new Square(1);
        assertEquals(1, square.computeArea());

        square = new Square(121);
        assertEquals(121 * 121, square.computeArea());
    }

    @Test
    public void testSetDimensions_3() throws InvalidDimensionException {
        Square square = new Square(1);
        square.setSide(123);

        try {
            square.setSide(-1);
        } catch (InvalidDimensionException e) {
            assertEquals("Invalid dimension", e.getMessage());
        }
    }

    @Test
    public void testComputeArea_3() throws InvalidDimensionException {
        Square square = new Square(1);
        assertEquals(1, square.computeArea());

        square.setSide(123);
        assertEquals(123 * 123, square.computeArea());
    }

}
