package org.rkov.geometry.threedimensional;

import org.rkov.geometry.threedimensional.ports.AreaCalculator;

public final class Cylinder implements AreaCalculator {

    private final double radius;
    private final double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
