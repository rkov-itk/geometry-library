package org.rkov.geometry.threedimensional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class SphereTest {

    private static final double EPSILON = 0.0001;

    @Test
    public void testRightSquare() {
        var sphere = new Sphere(1);

        assertEquals(4 * Math.PI, sphere.getSquare(), EPSILON);
    }

    @Test
    public void testSquareGrowsAsRadiusSquared() {
        var sphere = new Sphere(2);

        assertEquals(16 * Math.PI, sphere.getSquare(), EPSILON);
    }

    @Test
    public void testZeroRadiusSquare() {
        var sphere = new Sphere(0);

        assertEquals(0, sphere.getSquare(), EPSILON);
    }

    @Test
    public void testWrongSquare() {
        var sphere = new Sphere(1);

        assertFalse(Math.abs(12.56 - sphere.getSquare()) < EPSILON);
    }
}
