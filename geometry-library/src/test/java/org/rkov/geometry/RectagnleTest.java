
package org.rkov.geometry;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author yakov
 */
public class RectagnleTest extends TestCase {
    
    public RectagnleTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(RectagnleTest.class);
    }
    
    public void testRightSquare() {
        var rectangle = new Rectangle(2, 3);
        assertEquals(6, rectangle.getSquare(), 0.0001);
    }

    public void testWrongSquare() {
        var rectangle = new Rectangle(2, 3);
        assertFalse(Math.abs(5.99 - rectangle.getSquare()) < 0.0001);
    }

    public void testRightPerimeter() {
        var rectangle = new Rectangle(2, 3);
        assertEquals(10, rectangle.getPerimeter(), 0.0001);
    }

    public void testWrongPerimeter() {
        var rectangle = new Rectangle(2, 3);
        assertFalse(Math.abs(9.99 - rectangle.getPerimeter()) < 0.0001);
    }
}
