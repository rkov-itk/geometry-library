package org.rkov.geometry;

import org.rkov.geometry.ports.AreaCalculator;
import org.rkov.geometry.ports.PerimeterCalculator;

public final class Circle implements AreaCalculator, PerimeterCalculator {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
