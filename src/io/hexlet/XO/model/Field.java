package io.hexlet.XO.model;

import io.hexlet.XO.model.exceptions.AlreadyOccupiedException;
import io.hexlet.XO.model.exceptions.InvalidPointException;

public class Field {

    private static final int FIELD_SIZE = 3;
    private static final int MAX_COORDINATE = 2;
    private Figure field[][] = new Figure[FIELD_SIZE][FIELD_SIZE];

    public int getSize () {
        return FIELD_SIZE;
    }

    public Figure getFigure(Point point) throws InvalidPointException {
        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }
        return field[point.getCoordinateX()][point.getCoordinateY()];
    }
    public void setFigure(Point point, Figure figure) throws InvalidPointException,
            AlreadyOccupiedException {
        if (!checkPoint(point)) {
            throw new InvalidPointException();
        }


            field[point.getCoordinateX()][point.getCoordinateY()] = figure;
    }

    private boolean checkPoint(Point point) {
        return checkCoordinate(point.getCoordinateX()) & checkCoordinate(point.getCoordinateY());
    }
    private boolean checkCoordinate(final int coordinate) {
        return coordinate >= 0 & coordinate <= MAX_COORDINATE;
    }
}
