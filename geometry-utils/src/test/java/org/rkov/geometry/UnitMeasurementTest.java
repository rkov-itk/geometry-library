package org.rkov.geometry;


import org.junit.Test;
import org.rkov.geometry.utils.Unit;
import org.rkov.geometry.utils.UnitMeasurementValue;

import static org.junit.Assert.assertTrue;

public class UnitMeasurementTest {

    @Test
    public void testUnitMeasurement() {
        UnitMeasurementValue unitMeasurementValue = new UnitMeasurementValue(Unit.CENTIMETER, Unit.METER);

        var result = unitMeasurementValue.update(100);

        assertTrue(result == 1);
    }
}
