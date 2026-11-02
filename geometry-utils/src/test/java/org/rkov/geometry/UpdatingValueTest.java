package org.rkov.geometry;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.rkov.geometry.utils.Unit;
import org.rkov.geometry.utils.UnitMeasurementValue;

public class AppTest {


    @Test
    public void successUnitMeasurement() {
        UnitMeasurementValue unitMeasurementValue = new UnitMeasurementValue(Unit.CENTIMETER, Unit.METER);

        var result = unitMeasurementValue.update(100);

        assertTrue(result == 1);
    }
}
