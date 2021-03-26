package io.hexlet.XO.model;

import io.hexlet.XO.model.exceptions.AlreadyOccupiedException;
import io.hexlet.XO.model.exceptions.InvalidPointException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    @Test
    public void testGetSize() throws Exception {
        final Field field = new Field();
        assertEquals(3, field.getSize());
    }

    @Test
    void setFigure() throws Exception {
        final Field field = new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;

        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);

        assertEquals(inputFigure, actualFigure);
    }
}