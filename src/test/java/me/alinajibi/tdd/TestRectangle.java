package me.alinajibi.tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class TestRectangle {
    @Test
    public void testConstructor_1() throws InvalidDimensionException {
        Rectangle rectangle = new Rectangle(1, 2);
        try {
            rectangle = new Rectangle(-1, 2);
            fail("Expected InvalidDimensionException");
        } catch (InvalidDimensionException e) {
            assertEquals("Invalid dimension", e.getMessage());
        }
        try {
            rectangle = new Rectangle(1, -2);
            fail("Expected InvalidDimensionException");
        } catch (InvalidDimensionException e) {
            assertEquals("Invalid dimension", e.getMessage());
        }
    }

    @Test
    public void testComputeArea_1() throws InvalidDimensionException {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.computeArea());

        rectangle = new Rectangle(121, 12);
        assertEquals(121 * 12, rectangle.computeArea());
    }

    @Test
    public void testSetDimensions_2() throws InvalidDimensionException {
        Rectangle rectangle = new Rectangle(1, 2);
        rectangle.setWidth(123);
        rectangle.setHeight(123);

        try {
            rectangle.setWidth(-1);
            fail("Expected InvalidDimensionException");
        } catch (InvalidDimensionException e) {
            assertEquals("Invalid dimension", e.getMessage());
        }
        try {
            rectangle.setHeight(-1);
            fail("Expected InvalidDimensionException");
        } catch (InvalidDimensionException e) {
            assertEquals("Invalid dimension", e.getMessage());
        }
    }

    @Test
    public void testComputeArea_2() throws InvalidDimensionException {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(2, rectangle.computeArea());

        rectangle.setWidth(123);
        rectangle.setHeight(123);
        assertEquals(123 * 123, rectangle.computeArea());

        rectangle.setWidth(1);
        assertEquals(1 * 123, rectangle.computeArea());

        rectangle.setHeight(1);
        assertEquals(1 * 1, rectangle.computeArea());
    }

}
