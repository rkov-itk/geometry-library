
package org.rkov.geometry;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author yakov
 */
public class TriangleTest extends TestCase {
    
    public TriangleTest(String testName) {
        super(testName);
    }

    public static TestSuite suite() {
        return new TestSuite(TriangleTest.class);
    }

    public void testRightSquare() {
        var triangle = new Triangle(3, 4, 5);

        assertEquals(6, triangle.getSquare(), 0.0001);
    }

    public void testWrongSquare() {
        var triangle = new Triangle(3, 4, 5);

        assertFalse(Math.abs(5.99 - triangle.getSquare()) < 0.0001);
    }

    public void testRightPerimeter() {
        var triangle = new Triangle(3, 4, 5);

        assertEquals(12, triangle.getPerimeter(), 0.0001);
    }

    public void testWrongPerimeter() {
        var triangle = new Triangle(3, 4, 5);

        assertFalse(Math.abs(11.99 - triangle.getPerimeter()) < 0.0001);
    }

}
