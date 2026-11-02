package org.rkov.geometry.threedimensional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class CubeTest {

    private static final double EPSILON = 0.0001;

    @Test
    public void testRightSquare() {
        var cube = new Cube(2);

        assertEquals(24, cube.getSquare(), EPSILON);
    }

    @Test
    public void testUnitEdgeSquare() {
        var cube = new Cube(1);

        assertEquals(6, cube.getSquare(), EPSILON);
    }

    @Test
    public void testZeroEdgeSquare() {
        var cube = new Cube(0);

        assertEquals(0, cube.getSquare(), EPSILON);
    }

    @Test
    public void testWrongSquare() {
        var cube = new Cube(2);

        assertFalse(Math.abs(23.99 - cube.getSquare()) < EPSILON);
    }

    @Test
    public void testSquareIsSurfaceAreaOfAllSixFaces() {
        var cube = new Cube(3);

        assertEquals(6 * 3 * 3, cube.getSquare(), EPSILON);
    }
}
