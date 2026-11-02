package org.rkov.geometry.utils;

public enum Unit {
    MILLIMETER, CENTIMETER, DECIMETER, METER, KILOMETER;

    public static double fromMeterTo(Unit unit, double value) {
        switch (unit) {
            case MILLIMETER:
                return value * 1000;
            case CENTIMETER:
                return value * 100;
            case DECIMETER:
                return value * 10;
            case METER:
                return value;
            case KILOMETER:
                return value * .001;                
            default:
                throw new AssertionError();
        }
    }

    
}
