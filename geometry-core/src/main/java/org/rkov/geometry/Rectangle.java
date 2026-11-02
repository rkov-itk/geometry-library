package org.rkov.geometry;

import org.rkov.geometry.ports.AreaCalculator;
import org.rkov.geometry.ports.PerimeterCalculator;

public final class Rectangle implements AreaCalculator, PerimeterCalculator {

    private final double lengthX, lengthY;

    public Rectangle(double lengthX, double lengthY) {
        this.lengthX = lengthX;
        this.lengthY = lengthY;
    }

    @Override
    public double getSquare() {
        return lengthX * lengthY;
    }

    @Override
    public double getPerimeter() {
        return 2 * (lengthX + lengthY);
    }
}
