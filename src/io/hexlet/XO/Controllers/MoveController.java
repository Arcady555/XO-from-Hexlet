package io.hexlet.XO.Controllers;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;
import io.hexlet.XO.model.exceptions.AlreadyOccupiedException;

public class MoveController {

    public void applyFigure (final Field field,
                             final Figure figure,
                             final Point point)
            throws io.hexlet.XO.model.exceptions.AbstractXOException {
        if (field.getFigure(point) != null) {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);

    }
}
