package io.hexlet.XO.model;

public class Game {

    private static String name;
    private Player[] players;
    private Field field;

    public Game (final String name, Player[] players, Field field) {
        //Game.name = name;
        this.players = players;
        this.field = field;
    }

    public String getName() {
        return name;
    }
    public Player[] getPlayer() {
        return players;
    }
    public Field getField() {
        return field;
    }

}
