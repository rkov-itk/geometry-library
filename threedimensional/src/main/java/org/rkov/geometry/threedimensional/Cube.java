package org.rkov.geometry.threedimensional;

import org.rkov.geometry.threedimensional.ports.AreaCalculator;


public final class Cube implements AreaCalculator {

    private final double edge;

    public Cube(double edge) {
        this.edge = edge;
    }

    @Override
    public double getSquare() {
        return 6 * Math.pow(edge, 2);
    }
}
