package io.hexlet.XO.Controllers;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Point;
import io.hexlet.XO.model.exceptions.InvalidPointException;

public class CurrentMoveController {

    public Figure currentMove(Field field) throws InvalidPointException {
        int countX = 0;
        int countO = 0;
        Point point = new Point(0,0);
        int i = point.getCoordinateX();
        int j = point.getCoordinateY();
        for (i = 0; i < field.getSize(); i++) {
            for (j = 0; j < field.getSize(); j++) {
                if (Figure.X.equals(field.getFigure(new Point(i, j)))) {
                    countX++;
                }
                if (Figure.O.equals(field.getFigure(new Point(i, j)))) {
                    countO++;
                }
            }
        }
        if (countX == countO) {
            return Figure.X;
        } else {
            return Figure.O;
        }
    }
}
