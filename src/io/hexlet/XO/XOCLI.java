package io.hexlet.XO;

import io.hexlet.XO.View.ConsoleView;
import io.hexlet.XO.model.Field;
import io.hexlet.XO.model.Figure;
import io.hexlet.XO.model.Game;
import io.hexlet.XO.model.Player;
import io.hexlet.XO.model.exceptions.InvalidPointException;

public class XOCLI {

    public static void main (String[] args) throws InvalidPointException {
        final String name1 = "Arcady";
        final String name2 = "neArcady";

        final Player[] players = new Player[2];
        players[0] = new Player(name1, Figure.X);
        players[1] = new Player(name2, Figure.O);

        final Game gameXO = new Game(players, new Field(3), "XO");

        final ConsoleView consoleView = new ConsoleView();
        consoleView.show(gameXO);
        while(consoleView.move(gameXO)) {
            consoleView.show(gameXO);

    }
}
