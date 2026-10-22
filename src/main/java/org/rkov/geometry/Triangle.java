package org.rkov.geometry;

import org.rkov.geometry.ports.AreaCalculator;
import org.rkov.geometry.ports.PerimeterCalculator;

public final class Triangle implements AreaCalculator, PerimeterCalculator {

    private final double lengthA, lengthB, lengthC;

    public Triangle(double lengthAll) {
        this(lengthAll, lengthAll, lengthAll);
    }

    public Triangle(double lengthA, double lengthB, double lengthC) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double getSquare() {
        double p = getPerimeter() / 2;

        return Math.sqrt(p * (p - lengthA) * (p - lengthB) * (p - lengthC));
    }

    @Override
    public double getPerimeter() {
        return lengthA + lengthB + lengthC;
    }
}
