package org.rkov.geometry.threedimensional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class CylinderTest {

    private static final double EPSILON = 0.0001;

    @Test
    public void testRightSquare() {
        var cylinder = new Cylinder(1, 1);

        assertEquals(4 * Math.PI, cylinder.getSquare(), EPSILON);
    }

    @Test
    public void testSquareOfRadiusThreeAndHeightFive() {
        var cylinder = new Cylinder(3, 5);

        assertEquals(48 * Math.PI, cylinder.getSquare(), EPSILON);
    }

    @Test
    public void testZeroHeightSquareIsTwoBaseAreas() {
        var cylinder = new Cylinder(2, 0);

        assertEquals(2 * Math.PI * Math.pow(2, 2), cylinder.getSquare(), EPSILON);
    }

    @Test
    public void testWrongSquare() {
        var cylinder = new Cylinder(1, 1);

        assertFalse(Math.abs(12.56 - cylinder.getSquare()) < EPSILON);
    }
}
