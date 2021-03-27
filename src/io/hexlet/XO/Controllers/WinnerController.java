package io.hexlet.XO.Controllers;

import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Point;
import io.hexlet.XO.model.exceptions.InvalidPointException;

public class WinnerController {

    public Figure getWinner(Field field) throws InvalidPointException {

        for (int i = 0; i < field.getSize(); i++) {
            if (checkFigure(field, new Point(0, i),
                    new Point(1, i),
                    new Point(2, i))) {
                return field.getFigure(new Point(0, i));
            }
        }
        for (int i = 0; i < field.getSize(); i++) {
            if (checkFigure(field, new Point(i, 0),
                    new Point(i, 1),
                    new Point(i, 2))) {
                return field.getFigure(new Point(i, 0));
            }
        }
        if (checkFigure(field, new Point(2, 0),
                new Point(1, 1),
                new Point(0, 2))) {
            return field.getFigure(new Point(2, 0));
        }
        if (checkFigure(field, new Point(0, 2),
                new Point(1, 1),
                new Point(2, 0))) {
            return field.getFigure(new Point(0, 2));
        }
        return null;
    }

    private boolean checkFigure(Field field, Point p1, Point p2, Point p3) throws InvalidPointException {
        if (field.getFigure(p1) != null
                && field.getFigure(p2) != null
                && field.getFigure(p3) != null
                && field.getFigure(p1).equals(field.getFigure(p2))
                && field.getFigure(p1).equals(field.getFigure(p3))) {
            return true;
        }
        return false;
    }
}

