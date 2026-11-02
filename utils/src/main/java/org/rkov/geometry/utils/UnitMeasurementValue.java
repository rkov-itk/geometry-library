package org.rkov.geometry.utils;

public final class UnitMeasurementValue {
    private final Unit from, to;

    public UnitMeasurementValue(Unit from, Unit to) {
        this.from = from;
        this.to = to;
    }

    public double update(double value) {
        var multiply = Unit.fromMeterTo(to, value) / Unit.fromMeterTo(from, value);

        return value * multiply;
    }

}
