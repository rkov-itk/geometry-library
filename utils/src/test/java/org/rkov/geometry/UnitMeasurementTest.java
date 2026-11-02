package org.rkov.geometry;


import org.junit.Test;
import org.rkov.geometry.utils.Unit;
import org.rkov.geometry.utils.UnitMeasurementValue;

import static org.junit.Assert.assertEquals;

public class UnitMeasurementTest {

    @Test
    public void testUnitMeasurement() {
        UnitMeasurementValue unitMeasurementValue = new UnitMeasurementValue(Unit.CENTIMETER, Unit.METER);

        var result = unitMeasurementValue.update(100);

        assertEquals(1, result, 0.0);
    }

    @Test
    public void fromMeterToKm() {
        UnitMeasurementValue unitMeasurementValue = new UnitMeasurementValue(Unit.METER, Unit.KILOMETER);

        var result = unitMeasurementValue.update(1);

        assertEquals(0.001, result, 0.0);
    }

    @Test
    public void fromKmToMeter() {
        UnitMeasurementValue unitMeasurementValue = new UnitMeasurementValue(Unit.KILOMETER, Unit.METER);

        var result = unitMeasurementValue.update((double) 1);

        assertEquals(1000, result, 0.0);
    }
}
