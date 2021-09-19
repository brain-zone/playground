package net.matrix.recipe.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import net.matrix.recipe.command.MeasurementUnitCommand;
import net.matrix.recipe.models.MeasurementUnit;

class MeasurementUnitCommandToMeasurementUnitTest {
    final MeasurementUnitCommandToMeasurementUnit converter = new MeasurementUnitCommandToMeasurementUnit();

    @Test
    final void tesConvert_EmptyValue() {
        assertNotNull(converter.convert(new MeasurementUnitCommand()));
    }

    @Test
    final void tesConvert_NullValue() {
        assertNull(converter.convert(null));
    }

    @Test
    final void testConvert() {
        MeasurementUnitCommand measurementUnitCommand = new MeasurementUnitCommand();
        measurementUnitCommand.setId(123L);
        measurementUnitCommand.setMeasure("Pint");

        MeasurementUnit measurementUnit = converter.convert(measurementUnitCommand);
        assertEquals(123L, measurementUnit.getId());
        assertEquals("Pint", measurementUnit.getMeasure());
    }
}
