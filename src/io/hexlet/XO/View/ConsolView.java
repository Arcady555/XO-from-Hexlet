package io.hexlet.XO.View;

import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Game;
import io.hexlet.XO.model.Point;
import io.hexlet.XO.model.exceptions.InvalidPointException;

public class ConsolView {
    private static final String SEPARATOR = "~~~~~~~~~~~\n";
    private final StringBuilder fieldBuilder = new StringBuilder();

    public void show(Game game) throws InvalidPointException {
        Field field = game.getField();
        for (int x1 = 0; x1 < field.getSize(); x1++) {
            for (int y1 = 0; y1 < field.getSize(); y1++) {
                Point point = new Point(x1, y1);
                fieldBuilder.append(" " + getValue(game, x1, y1) + " ");
                if (y1 == 2) {
                    break;
                }
                fieldBuilder.append("|");
            }
            fieldBuilder.append("\n");
            if (x1 == 2) {
                break;
            }
            fieldBuilder.append(SEPARATOR);
        }
    }

    private String getValue(Game game, int x, int y) throws InvalidPointException {
        Field field = game.getField();
        Point point = new Point(x,  y);
        if (field.getFigure(point) == Figure.X) {
            return "X";
        } else if (field.getFigure(point) == Figure.O) {
            return "O";
        } else {
            return " ";
        }

    }

    public StringBuilder getFieldBuilder() {
        return fieldBuilder;
    }
}
