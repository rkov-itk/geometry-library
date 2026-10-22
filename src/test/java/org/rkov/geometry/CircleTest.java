
package org.rkov.geometry;

import junit.framework.TestCase;
import junit.framework.TestSuite;
 
/**
 *
 * @author yakov
 */
public class CircleTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public CircleTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite() {
        return new TestSuite(CircleTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testRightSquare() {
        var circle = new Circle(1);
        assertEquals(Math.PI, circle.getSquare(), 0.0001);
    }

    public void testWrongSquare() {
        var circle = new Circle(1);
        assertFalse(Math.abs(3.14 - circle.getSquare()) < 0.0001);
    }

    public void testRightPerimeter() {
        var circle = new Circle(1);
        assertEquals(2 * Math.PI, circle.getPerimeter(), 0.0001);
    }

    public void testWrongPerimeter() {
        var circle = new Circle(1);
        assertFalse(Math.abs(6.28 - circle.getPerimeter()) < 0.0001);
    }
}