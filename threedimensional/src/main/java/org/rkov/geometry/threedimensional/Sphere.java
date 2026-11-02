package org.rkov.geometry.threedimensional;

import org.rkov.geometry.threedimensional.ports.AreaCalculator;

public final class Sphere implements AreaCalculator {

    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
